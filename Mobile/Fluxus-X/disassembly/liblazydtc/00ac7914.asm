; ossl_rand_get_nonce @ 00ac7914
00ac7914	stp x22,x21,[sp, #-0x30]!
00ac7918	stp x20,x19,[sp, #0x10]
00ac791c	mov x20,x1
00ac7920	mov w0,wzr
00ac7924	mov w1,wzr
00ac7928	stp x29,x30,[sp, #0x20]
00ac792c	add x29,sp,#0x20
00ac7930	mov x21,x5
00ac7934	mov x22,x4
00ac7938	bl 0x00c3f910
00ac793c	cbz x0,0x00ac7984
00ac7940	mov x19,x0
00ac7944	bl 0x00c3f8c0
00ac7948	cbz w0,0x00ac79bc
00ac794c	cbz x22,0x00ac7968
00ac7950	mov x0,x19
00ac7954	mov x1,x22
00ac7958	mov x2,x21
00ac795c	mov x3,xzr
00ac7960	bl 0x00c3f8d0
00ac7964	cbz w0,0x00ac79bc
00ac7968	mov x0,x19
00ac796c	bl 0x00c3f900
00ac7970	mov x21,x0
00ac7974	mov x0,x19
00ac7978	bl 0x00c3f8e0
00ac797c	str x0,[x20]
00ac7980	b 0x00ac79c0
00ac7984	bl 0x00c342a0
00ac7988	adrp x0,0x2c0000
00ac798c	adrp x2,0x2c0000
00ac7990	add x0,x0,#0x483
00ac7994	add x2,x2,#0x49b
00ac7998	orr w1,wzr,#0x38
00ac799c	bl 0x00c342b0
00ac79a0	mov w1,#0x100
00ac79a4	mov w0,#0x24
00ac79a8	movk w1,#0xc, LSL #16
00ac79ac	mov x2,xzr
00ac79b0	bl 0x00c342c0
00ac79b4	mov x21,xzr
00ac79b8	b 0x00ac79c8
00ac79bc	mov x21,xzr
00ac79c0	mov x0,x19
00ac79c4	bl 0x00c3f8f0
00ac79c8	ldp x29,x30,[sp, #0x20]
00ac79cc	ldp x20,x19,[sp, #0x10]
00ac79d0	mov x0,x21
00ac79d4	ldp x22,x21,[sp], #0x30
00ac79d8	ret
