; ossl_ecx_public_from_private @ 00a3da48
00a3da48	stp x29,x30,[sp, #-0x10]!
00a3da4c	ldr w8,[x0, #0x60]
00a3da50	mov x29,sp
00a3da54	cmp w8,#0x3
00a3da58	b.hi 0x00a3da88
00a3da5c	adrp x9,0x758000
00a3da60	add x9,x9,#0xbe8
00a3da64	ldrsw x8,[x9, x8, LSL #0x2]
00a3da68	add x8,x8,x9
00a3da6c	br x8
00a3da70	ldr x1,[x0, #0x50]
00a3da74	add x0,x0,#0x11
00a3da78	bl 0x00c3a6b0
00a3da7c	mov w0,#0x1
00a3da80	ldp x29,x30,[sp], #0x10
00a3da84	ret
00a3da88	mov w0,#0x1
00a3da8c	ldp x29,x30,[sp], #0x10
00a3da90	ret
00a3da94	ldr x1,[x0, #0x50]
00a3da98	add x0,x0,#0x11
00a3da9c	bl 0x00c3a550
00a3daa0	mov w0,#0x1
00a3daa4	ldp x29,x30,[sp], #0x10
00a3daa8	ret
00a3daac	ldp x8,x3,[x0]
00a3dab0	ldr x2,[x0, #0x50]
00a3dab4	add x1,x0,#0x11
00a3dab8	mov x0,x8
00a3dabc	bl 0x00c3a670
00a3dac0	cbz w0,0x00a3daf4
00a3dac4	mov w0,#0x1
00a3dac8	ldp x29,x30,[sp], #0x10
00a3dacc	ret
00a3dad0	ldp x8,x3,[x0]
00a3dad4	ldr x2,[x0, #0x50]
00a3dad8	add x1,x0,#0x11
00a3dadc	mov x0,x8
00a3dae0	bl 0x00c3a560
00a3dae4	cbz w0,0x00a3db10
00a3dae8	mov w0,#0x1
00a3daec	ldp x29,x30,[sp], #0x10
00a3daf0	ret
00a3daf4	bl 0x00c342a0
00a3daf8	adrp x0,0x2a0000
00a3dafc	adrp x2,0x2d9000
00a3db00	add x0,x0,#0x174
00a3db04	add x2,x2,#0xb8a
00a3db08	mov w1,#0x25
00a3db0c	b 0x00a3db28
00a3db10	bl 0x00c342a0
00a3db14	adrp x0,0x2a0000
00a3db18	adrp x2,0x2d9000
00a3db1c	add x0,x0,#0x174
00a3db20	add x2,x2,#0xb8a
00a3db24	mov w1,#0x2f
00a3db28	bl 0x00c342b0
00a3db2c	mov w0,#0x10
00a3db30	mov w1,#0xa6
00a3db34	mov x2,xzr
00a3db38	bl 0x00c342c0
00a3db3c	mov w0,wzr
00a3db40	ldp x29,x30,[sp], #0x10
00a3db44	ret
