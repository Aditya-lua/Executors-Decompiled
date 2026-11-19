; FUN_00ad7924 @ 00ad7924
00ad7924	str x19,[sp, #-0x20]!
00ad7928	stp x29,x30,[sp, #0x10]
00ad792c	add x29,sp,#0x10
00ad7930	cbz x0,0x00ad7988
00ad7934	mov w19,w1
00ad7938	bl 0x00c34c30
00ad793c	cmp w19,#0x5
00ad7940	mov w8,w0
00ad7944	b.eq 0x00ad7978
00ad7948	cmp w19,#0x3
00ad794c	b.ne 0x00ad7990
00ad7950	bl 0x00c342a0
00ad7954	adrp x0,0x2ae000
00ad7958	adrp x2,0x2ce000
00ad795c	add x0,x0,#0x623
00ad7960	add x2,x2,#0x335
00ad7964	mov w1,#0x183
00ad7968	bl 0x00c342b0
00ad796c	mov w0,#0x4
00ad7970	mov w1,#0x8d
00ad7974	b 0x00ad7a40
00ad7978	mov w0,w8
00ad797c	bl 0x00c3ffd0
00ad7980	cmn w0,#0x1
00ad7984	b.eq 0x00ad7a1c
00ad7988	mov w0,#0x1
00ad798c	b 0x00ad7a4c
00ad7990	cmp w8,#0x29f
00ad7994	mov w0,#0x1
00ad7998	b.le 0x00ad79b8
00ad799c	sub w9,w8,#0x446
00ad79a0	cmp w9,#0x6
00ad79a4	b.cc 0x00ad7a4c
00ad79a8	sub w8,w8,#0x2a0
00ad79ac	cmp w8,#0x4
00ad79b0	b.cc 0x00ad7a4c
00ad79b4	b 0x00ad79f4
00ad79b8	sub w9,w8,#0x40
00ad79bc	cmp w9,#0x35
00ad79c0	b.hi 0x00ad79e0
00ad79c4	mov w10,#0x1
00ad79c8	lsl x9,x10,x9
00ad79cc	orr x10,xzr,#-0x7fffffff
00ad79d0	movk x10,#0x0, LSL #32
00ad79d4	movk x10,#0x24, LSL #48
00ad79d8	tst x9,x10
00ad79dc	b.ne 0x00ad7a4c
00ad79e0	sub w9,w8,#0x3
00ad79e4	cmp w9,#0x2
00ad79e8	b.cc 0x00ad7a4c
00ad79ec	cmp w8,#0x101
00ad79f0	b.eq 0x00ad7a4c
00ad79f4	bl 0x00c342a0
00ad79f8	adrp x0,0x2ae000
00ad79fc	adrp x2,0x2ce000
00ad7a00	add x0,x0,#0x623
00ad7a04	add x2,x2,#0x335
00ad7a08	mov w1,#0x1a3
00ad7a0c	bl 0x00c342b0
00ad7a10	mov w0,#0x4
00ad7a14	mov w1,#0x9d
00ad7a18	b 0x00ad7a40
00ad7a1c	bl 0x00c342a0
00ad7a20	adrp x0,0x2ae000
00ad7a24	adrp x2,0x2ce000
00ad7a28	add x0,x0,#0x623
00ad7a2c	add x2,x2,#0x335
00ad7a30	mov w1,#0x189
00ad7a34	bl 0x00c342b0
00ad7a38	mov w0,#0x4
00ad7a3c	mov w1,#0x8e
00ad7a40	mov x2,xzr
00ad7a44	bl 0x00c342c0
00ad7a48	mov w0,wzr
00ad7a4c	ldp x29,x30,[sp, #0x10]
00ad7a50	ldr x19,[sp], #0x20
00ad7a54	ret
