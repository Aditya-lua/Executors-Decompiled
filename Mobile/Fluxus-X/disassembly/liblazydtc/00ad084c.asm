; RSA_setup_blinding @ 00ad084c
00ad084c	str x27,[sp, #-0x60]!
00ad0850	stp x22,x21,[sp, #0x30]
00ad0854	stp x20,x19,[sp, #0x40]
00ad0858	mov x20,x1
00ad085c	mov x19,x0
00ad0860	mov x21,x1
00ad0864	stp x26,x25,[sp, #0x10]
00ad0868	stp x24,x23,[sp, #0x20]
00ad086c	stp x29,x30,[sp, #0x50]
00ad0870	add x29,sp,#0x50
00ad0874	cbnz x1,0x00ad0888
00ad0878	ldr x0,[x19, #0x8]
00ad087c	bl 0x00c38a60
00ad0880	mov x21,x0
00ad0884	cbz x0,0x00ad09dc
00ad0888	mov x0,x21
00ad088c	bl 0x00c38a90
00ad0890	mov x0,x21
00ad0894	bl 0x00c38a40
00ad0898	cbz x0,0x00ad08f8
00ad089c	ldr x22,[x19, #0x30]
00ad08a0	cbz x22,0x00ad0924
00ad08a4	bl 0x00c37710
00ad08a8	cbz x0,0x00ad09e4
00ad08ac	ldr x1,[x19, #0x28]
00ad08b0	mov w2,#0x4
00ad08b4	mov x24,x0
00ad08b8	bl 0x00c38df0
00ad08bc	ldr x8,[x19, #0x18]
00ad08c0	ldr x5,[x19, #0xa8]
00ad08c4	mov x0,xzr
00ad08c8	mov x1,x22
00ad08cc	ldr x4,[x8, #0x30]
00ad08d0	mov x2,x24
00ad08d4	mov x3,x21
00ad08d8	bl 0x00c38960
00ad08dc	mov x23,x0
00ad08e0	mov x0,x24
00ad08e4	bl 0x00c36290
00ad08e8	cbz x23,0x00ad0aa0
00ad08ec	mov x0,x23
00ad08f0	bl 0x00c389b0
00ad08f4	b 0x00ad0a54
00ad08f8	bl 0x00c342a0
00ad08fc	adrp x0,0x2a6000
00ad0900	adrp x2,0x2d4000
00ad0904	add x0,x0,#0x759
00ad0908	add x2,x2,#0x415
00ad090c	mov w1,#0x84
00ad0910	bl 0x00c342b0
00ad0914	mov w1,#0x100
00ad0918	mov w0,#0x4
00ad091c	movk w1,#0xc, LSL #16
00ad0920	b 0x00ad0a44
00ad0924	ldr x22,[x19, #0x38]
00ad0928	cbz x22,0x00ad0a20
00ad092c	ldr x27,[x19, #0x40]
00ad0930	cbz x27,0x00ad0a20
00ad0934	ldr x24,[x19, #0x48]
00ad0938	cbz x24,0x00ad0a20
00ad093c	mov x0,x21
00ad0940	bl 0x00c38a90
00ad0944	mov x0,x21
00ad0948	bl 0x00c38a40
00ad094c	mov x23,x0
00ad0950	mov x0,x21
00ad0954	bl 0x00c38a40
00ad0958	mov x25,x0
00ad095c	mov x0,x21
00ad0960	bl 0x00c38a40
00ad0964	cbz x0,0x00ad0a18
00ad0968	mov x26,x0
00ad096c	bl 0x00c38de0
00ad0970	mov x2,x0
00ad0974	mov x0,x25
00ad0978	mov x1,x27
00ad097c	bl 0x00c38880
00ad0980	cbz w0,0x00ad0a18
00ad0984	bl 0x00c38de0
00ad0988	mov x2,x0
00ad098c	mov x0,x26
00ad0990	mov x1,x24
00ad0994	bl 0x00c38880
00ad0998	cbz w0,0x00ad0a18
00ad099c	mov x0,x23
00ad09a0	mov x1,x25
00ad09a4	mov x2,x26
00ad09a8	mov x3,x21
00ad09ac	bl 0x00c39060
00ad09b0	cbz w0,0x00ad0a18
00ad09b4	mov x0,xzr
00ad09b8	mov x1,x22
00ad09bc	mov x2,x23
00ad09c0	mov x3,x21
00ad09c4	bl 0x00c38b20
00ad09c8	mov x22,x0
00ad09cc	mov x0,x21
00ad09d0	bl 0x00c38a20
00ad09d4	cbnz x22,0x00ad08a4
00ad09d8	b 0x00ad0a20
00ad09dc	mov x23,xzr
00ad09e0	b 0x00ad0a80
00ad09e4	bl 0x00c342a0
00ad09e8	adrp x0,0x2a6000
00ad09ec	adrp x2,0x2d4000
00ad09f0	add x0,x0,#0x759
00ad09f4	add x2,x2,#0x415
00ad09f8	mov w1,#0x96
00ad09fc	bl 0x00c342b0
00ad0a00	mov w1,#0x100
00ad0a04	mov w0,#0x4
00ad0a08	movk w1,#0xc, LSL #16
00ad0a0c	mov x2,xzr
00ad0a10	bl 0x00c342c0
00ad0a14	b 0x00ad0a50
00ad0a18	mov x0,x21
00ad0a1c	bl 0x00c38a20
00ad0a20	bl 0x00c342a0
00ad0a24	adrp x0,0x2a6000
00ad0a28	adrp x2,0x2d4000
00ad0a2c	add x0,x0,#0x759
00ad0a30	add x2,x2,#0x415
00ad0a34	mov w1,#0x8b
00ad0a38	bl 0x00c342b0
00ad0a3c	mov w0,#0x4
00ad0a40	mov w1,#0x8c
00ad0a44	mov x2,xzr
00ad0a48	bl 0x00c342c0
00ad0a4c	mov x22,xzr
00ad0a50	mov x23,xzr
00ad0a54	mov x0,x21
00ad0a58	bl 0x00c38a20
00ad0a5c	cmp x21,x20
00ad0a60	b.eq 0x00ad0a6c
00ad0a64	mov x0,x21
00ad0a68	bl 0x00c38a30
00ad0a6c	ldr x8,[x19, #0x30]
00ad0a70	cmp x22,x8
00ad0a74	b.eq 0x00ad0a80
00ad0a78	mov x0,x22
00ad0a7c	bl 0x00c36290
00ad0a80	mov x0,x23
00ad0a84	ldp x29,x30,[sp, #0x50]
00ad0a88	ldp x20,x19,[sp, #0x40]
00ad0a8c	ldp x22,x21,[sp, #0x30]
00ad0a90	ldp x24,x23,[sp, #0x20]
00ad0a94	ldp x26,x25,[sp, #0x10]
00ad0a98	ldr x27,[sp], #0x60
00ad0a9c	ret
00ad0aa0	bl 0x00c342a0
00ad0aa4	adrp x0,0x2a6000
00ad0aa8	adrp x2,0x2d4000
00ad0aac	add x0,x0,#0x759
00ad0ab0	add x2,x2,#0x415
00ad0ab4	mov w1,#0xa1
00ad0ab8	bl 0x00c342b0
00ad0abc	mov w1,#0x3
00ad0ac0	mov w0,#0x4
00ad0ac4	movk w1,#0x8, LSL #16
00ad0ac8	mov x2,xzr
00ad0acc	bl 0x00c342c0
00ad0ad0	b 0x00ad0a54
