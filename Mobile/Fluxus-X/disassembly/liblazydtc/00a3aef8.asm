; ossl_ec_GFp_simple_make_affine @ 00a3aef8
00a3aef8	stp x24,x23,[sp, #-0x40]!
00a3aefc	stp x22,x21,[sp, #0x10]
00a3af00	stp x20,x19,[sp, #0x20]
00a3af04	stp x29,x30,[sp, #0x30]
00a3af08	ldr w8,[x1, #0x28]
00a3af0c	add x29,sp,#0x30
00a3af10	cbnz w8,0x00a3af28
00a3af14	mov x19,x2
00a3af18	mov x21,x1
00a3af1c	mov x22,x0
00a3af20	bl 0x00c3ae10
00a3af24	cbz w0,0x00a3af44
00a3af28	mov w21,#0x1
00a3af2c	mov w0,w21
00a3af30	ldp x29,x30,[sp, #0x30]
00a3af34	ldp x20,x19,[sp, #0x20]
00a3af38	ldp x22,x21,[sp, #0x10]
00a3af3c	ldp x24,x23,[sp], #0x40
00a3af40	ret
00a3af44	mov x20,xzr
00a3af48	cbnz x19,0x00a3af60
00a3af4c	ldr x0,[x22, #0xa8]
00a3af50	bl 0x00c38a60
00a3af54	mov x20,x0
00a3af58	mov x19,x0
00a3af5c	cbz x0,0x00a3afcc
00a3af60	mov x0,x19
00a3af64	bl 0x00c38a90
00a3af68	mov x0,x19
00a3af6c	bl 0x00c38a40
00a3af70	mov x23,x0
00a3af74	mov x0,x19
00a3af78	bl 0x00c38a40
00a3af7c	cbz x0,0x00a3b004
00a3af80	mov x24,x0
00a3af84	mov x0,x22
00a3af88	mov x1,x21
00a3af8c	mov x2,x23
00a3af90	mov x3,x24
00a3af94	mov x4,x19
00a3af98	bl 0x00c3ae70
00a3af9c	cbz w0,0x00a3b004
00a3afa0	mov x0,x22
00a3afa4	mov x1,x21
00a3afa8	mov x2,x23
00a3afac	mov x3,x24
00a3afb0	mov x4,x19
00a3afb4	bl 0x00c3ae80
00a3afb8	cbz w0,0x00a3b004
00a3afbc	ldr w8,[x21, #0x28]
00a3afc0	cbz w8,0x00a3afd4
00a3afc4	mov w21,#0x1
00a3afc8	b 0x00a3b008
00a3afcc	mov w21,wzr
00a3afd0	b 0x00a3af2c
00a3afd4	bl 0x00c342a0
00a3afd8	adrp x0,0x2c7000
00a3afdc	adrp x2,0x2a0000
00a3afe0	add x0,x0,#0x8a7
00a3afe4	add x2,x2,#0x142
00a3afe8	mov w1,#0x4aa
00a3afec	bl 0x00c342b0
00a3aff0	mov w1,#0x103
00a3aff4	mov w0,#0x10
00a3aff8	movk w1,#0xc, LSL #16
00a3affc	mov x2,xzr
00a3b000	bl 0x00c342c0
00a3b004	mov w21,wzr
00a3b008	mov x0,x19
00a3b00c	bl 0x00c38a20
00a3b010	mov x0,x20
00a3b014	bl 0x00c38a30
00a3b018	b 0x00a3af2c
