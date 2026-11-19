; ossl_pem_check_suffix @ 00ab7924
00ab7924	str x21,[sp, #-0x30]!
00ab7928	stp x20,x19,[sp, #0x10]
00ab792c	stp x29,x30,[sp, #0x20]
00ab7930	add x29,sp,#0x20
00ab7934	mov x20,x1
00ab7938	mov x19,x0
00ab793c	bl 0x00c2ff50
00ab7940	mov x21,x0
00ab7944	mov x0,x20
00ab7948	bl 0x00c2ff50
00ab794c	add w8,w0,#0x1
00ab7950	cmp w8,w21
00ab7954	mov w8,wzr
00ab7958	b.ge 0x00ab798c
00ab795c	add x8,x19,w21, SXTW 
00ab7960	sub x21,x8,w0, SXTW 
00ab7964	mov x0,x21
00ab7968	mov x1,x20
00ab796c	bl 0x00c301f0
00ab7970	mov w8,wzr
00ab7974	cbnz w0,0x00ab798c
00ab7978	ldrb w8,[x21, #-0x1]!
00ab797c	cmp w8,#0x20
00ab7980	mov w8,wzr
00ab7984	b.ne 0x00ab798c
00ab7988	sub w8,w21,w19
00ab798c	ldp x29,x30,[sp, #0x20]
00ab7990	ldp x20,x19,[sp, #0x10]
00ab7994	mov w0,w8
00ab7998	ldr x21,[sp], #0x30
00ab799c	ret
