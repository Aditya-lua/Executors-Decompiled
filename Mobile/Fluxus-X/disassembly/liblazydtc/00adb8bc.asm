; RSA_padding_add_X931 @ 00adb8bc
00adb8bc	str x23,[sp, #-0x40]!
00adb8c0	stp x20,x19,[sp, #0x20]
00adb8c4	mov w20,w3
00adb8c8	sxtw x8,w1
00adb8cc	sxtw x23,w20
00adb8d0	sub x8,x8,x23
00adb8d4	cmp w8,#0x1
00adb8d8	stp x22,x21,[sp, #0x10]
00adb8dc	stp x29,x30,[sp, #0x30]
00adb8e0	add x29,sp,#0x30
00adb8e4	b.gt 0x00adb91c
00adb8e8	bl 0x00c342a0
00adb8ec	adrp x0,0x2a6000
00adb8f0	adrp x2,0x2bc000
00adb8f4	add x0,x0,#0x7a3
00adb8f8	add x2,x2,#0x413
00adb8fc	mov w1,#0x24
00adb900	bl 0x00c342b0
00adb904	mov w0,#0x4
00adb908	mov w1,#0x6e
00adb90c	mov x2,xzr
00adb910	bl 0x00c342c0
00adb914	mov w0,#0xffffffff
00adb918	b 0x00adb984
00adb91c	mov x19,x2
00adb920	cmp w8,#0x2
00adb924	add x21,x0,#0x1
00adb928	b.ne 0x00adb938
00adb92c	mov w8,#0x6a
00adb930	strb w8,[x0]
00adb934	b 0x00adb968
00adb938	mov w9,#0x6b
00adb93c	cmp w8,#0x4
00adb940	strb w9,[x0]
00adb944	b.lt 0x00adb960
00adb948	sub x22,x8,#0x3
00adb94c	mov w1,#0xbb
00adb950	mov x0,x21
00adb954	mov x2,x22
00adb958	bl 0x00c301c0
00adb95c	add x21,x21,x22
00adb960	mov w8,#0xba
00adb964	strb w8,[x21], #0x1
00adb968	mov w2,w20
00adb96c	mov x0,x21
00adb970	mov x1,x19
00adb974	bl 0x00c2ffd0
00adb978	mov w8,#0xcc
00adb97c	mov w0,#0x1
00adb980	strb w8,[x21, x23]
00adb984	ldp x29,x30,[sp, #0x30]
00adb988	ldp x20,x19,[sp, #0x20]
00adb98c	ldp x22,x21,[sp, #0x10]
00adb990	ldr x23,[sp], #0x40
00adb994	ret
