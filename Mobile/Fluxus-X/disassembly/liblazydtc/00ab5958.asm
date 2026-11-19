; PEM_def_callback @ 00ab5958
00ab5958	stp x22,x21,[sp, #-0x30]!
00ab595c	stp x20,x19,[sp, #0x10]
00ab5960	mov w20,w1
00ab5964	mov x19,x0
00ab5968	stp x29,x30,[sp, #0x20]
00ab596c	add x29,sp,#0x20
00ab5970	cbz x3,0x00ab599c
00ab5974	mov x0,x3
00ab5978	mov x22,x3
00ab597c	bl 0x00c2ff50
00ab5980	cmp w0,w20
00ab5984	csel w20,w20,w0,gt
00ab5988	sxtw x2,w20
00ab598c	mov x0,x19
00ab5990	mov x1,x22
00ab5994	bl 0x00c2ffd0
00ab5998	b 0x00ab5a24
00ab599c	mov w21,w2
00ab59a0	bl 0x00c3ce70
00ab59a4	adrp x8,0x2ac000
00ab59a8	add x8,x8,#0x69e
00ab59ac	cmp x0,#0x0
00ab59b0	csel x3,x8,x0,eq
00ab59b4	cmp w21,#0x0
00ab59b8	mov w8,#0x4
00ab59bc	csel w1,wzr,w8,eq
00ab59c0	mov x0,x19
00ab59c4	mov w2,w20
00ab59c8	mov w4,w21
00ab59cc	bl 0x00c3ce80
00ab59d0	cbz w0,0x00ab5a18
00ab59d4	bl 0x00c342a0
00ab59d8	adrp x0,0x2ce000
00ab59dc	adrp x2,0x2c6000
00ab59e0	add x0,x0,#0x16c
00ab59e4	add x2,x2,#0x126
00ab59e8	orr w1,wzr,#0x3e
00ab59ec	bl 0x00c342b0
00ab59f0	mov w0,#0x9
00ab59f4	mov w1,#0x6d
00ab59f8	mov x2,xzr
00ab59fc	bl 0x00c342c0
00ab5a00	mov w2,w20
00ab5a04	mov x0,x19
00ab5a08	mov w1,wzr
00ab5a0c	bl 0x00c301c0
00ab5a10	mov w20,#0xffffffff
00ab5a14	b 0x00ab5a24
00ab5a18	mov x0,x19
00ab5a1c	bl 0x00c2ff50
00ab5a20	mov x20,x0
00ab5a24	mov w0,w20
00ab5a28	ldp x29,x30,[sp, #0x20]
00ab5a2c	ldp x20,x19,[sp, #0x10]
00ab5a30	ldp x22,x21,[sp], #0x30
00ab5a34	ret
