; FUN_00aa49b0 @ 00aa49b0
00aa49b0	stp x22,x21,[sp, #-0x30]!
00aa49b4	stp x20,x19,[sp, #0x10]
00aa49b8	mov x19,x1
00aa49bc	adrp x1,0x2aa000
00aa49c0	mov x20,x0
00aa49c4	add x1,x1,#0x4cc
00aa49c8	mov x0,x19
00aa49cc	stp x29,x30,[sp, #0x20]
00aa49d0	add x29,sp,#0x20
00aa49d4	bl 0x00c3e8c0
00aa49d8	cbz x0,0x00aa49e8
00aa49dc	adrp x1,0x2a0000
00aa49e0	add x1,x1,#0x3d2
00aa49e4	bl 0x00c3e970
00aa49e8	adrp x1,0x2da000
00aa49ec	add x1,x1,#0x129
00aa49f0	mov x0,x19
00aa49f4	bl 0x00c3e8c0
00aa49f8	cbz x0,0x00aa4a04
00aa49fc	ldr x1,[x20, #0x28]
00aa4a00	bl 0x00c3e970
00aa4a04	adrp x1,0x2a6000
00aa4a08	add x1,x1,#0x3e0
00aa4a0c	mov x0,x19
00aa4a10	bl 0x00c3e8c0
00aa4a14	cbz x0,0x00aa4a30
00aa4a18	mov x21,x0
00aa4a1c	ldr x0,[x20, #0x38]
00aa4a20	bl 0x00c3a440
00aa4a24	mov x1,x0
00aa4a28	mov x0,x21
00aa4a2c	bl 0x00c3e970
00aa4a30	ldr x0,[x20, #0x48]
00aa4a34	cbz x0,0x00aa4a84
00aa4a38	bl 0x00c325e0
00aa4a3c	cmp w0,#0x1
00aa4a40	b.lt 0x00aa4a84
00aa4a44	mov w21,wzr
00aa4a48	ldr x0,[x20, #0x48]
00aa4a4c	mov w1,w21
00aa4a50	bl 0x00c32610
00aa4a54	ldr x1,[x0]
00aa4a58	mov x22,x0
00aa4a5c	mov x0,x19
00aa4a60	bl 0x00c3e8c0
00aa4a64	cbz x0,0x00aa4a70
00aa4a68	ldr x1,[x22, #0x8]
00aa4a6c	bl 0x00c3e970
00aa4a70	ldr x0,[x20, #0x48]
00aa4a74	add w21,w21,#0x1
00aa4a78	bl 0x00c325e0
00aa4a7c	cmp w21,w0
00aa4a80	b.lt 0x00aa4a48
00aa4a84	ldp x29,x30,[sp, #0x20]
00aa4a88	ldp x20,x19,[sp, #0x10]
00aa4a8c	mov w0,#0x1
00aa4a90	ldp x22,x21,[sp], #0x30
00aa4a94	ret
