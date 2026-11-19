; ossl_ec_key_public_check @ 00a2ef34
00a2ef34	stp x22,x21,[sp, #-0x30]!
00a2ef38	stp x20,x19,[sp, #0x10]
00a2ef3c	stp x29,x30,[sp, #0x20]
00a2ef40	add x29,sp,#0x20
00a2ef44	mov x21,x1
00a2ef48	mov x20,x0
00a2ef4c	bl 0x00a2ed54
00a2ef50	cbz w0,0x00a2efb4
00a2ef54	ldr x0,[x20, #0x18]
00a2ef58	bl 0x00c3ab70
00a2ef5c	cbz x0,0x00a2efb4
00a2ef60	ldr x8,[x20, #0x18]
00a2ef64	mov x19,x0
00a2ef68	ldr x22,[x8, #0x10]
00a2ef6c	mov x0,x22
00a2ef70	bl 0x00c369b0
00a2ef74	cbz w0,0x00a2efcc
00a2ef78	bl 0x00c342a0
00a2ef7c	adrp x0,0x2b4000
00a2ef80	adrp x2,0x2d9000
00a2ef84	add x0,x0,#0x15e
00a2ef88	add x2,x2,#0xb5d
00a2ef8c	mov w1,#0x1e7
00a2ef90	bl 0x00c342b0
00a2ef94	mov w0,#0x10
00a2ef98	mov w1,#0x7a
00a2ef9c	mov x2,xzr
00a2efa0	bl 0x00c342c0
00a2efa4	mov w20,wzr
00a2efa8	mov x0,x19
00a2efac	bl 0x00c3ab60
00a2efb0	b 0x00a2efb8
00a2efb4	mov w20,wzr
00a2efb8	mov w0,w20
00a2efbc	ldp x29,x30,[sp, #0x20]
00a2efc0	ldp x20,x19,[sp, #0x10]
00a2efc4	ldp x22,x21,[sp], #0x30
00a2efc8	ret
00a2efcc	ldp x0,x3,[x20, #0x18]
00a2efd0	mov x1,x19
00a2efd4	mov x2,xzr
00a2efd8	mov x4,x22
00a2efdc	mov x5,x21
00a2efe0	bl 0x00c3ae30
00a2efe4	cbz w0,0x00a2f000
00a2efe8	ldr x0,[x20, #0x18]
00a2efec	mov x1,x19
00a2eff0	bl 0x00c3ae10
00a2eff4	cbz w0,0x00a2f02c
00a2eff8	mov w20,#0x1
00a2effc	b 0x00a2efa8
00a2f000	bl 0x00c342a0
00a2f004	adrp x0,0x2b4000
00a2f008	adrp x2,0x2d9000
00a2f00c	add x0,x0,#0x15e
00a2f010	add x2,x2,#0xb5d
00a2f014	mov w1,#0x1ec
00a2f018	bl 0x00c342b0
00a2f01c	mov w1,#0x10
00a2f020	mov w0,#0x10
00a2f024	movk w1,#0x8, LSL #16
00a2f028	b 0x00a2ef9c
00a2f02c	bl 0x00c342a0
00a2f030	adrp x0,0x2b4000
00a2f034	adrp x2,0x2d9000
00a2f038	add x0,x0,#0x15e
00a2f03c	add x2,x2,#0xb5d
00a2f040	orr w1,wzr,#0x1f0
00a2f044	bl 0x00c342b0
00a2f048	mov w0,#0x10
00a2f04c	mov w1,#0x82
00a2f050	b 0x00a2ef9c
