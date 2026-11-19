; PKCS5_pbe_set0_algor_ex @ 00a6aeac
00a6aeac	sub sp,sp,#0x60
00a6aeb0	stp x20,x19,[sp, #0x40]
00a6aeb4	mov x20,x0
00a6aeb8	adrp x0,0xc5e000
00a6aebc	add x0,x0,#0xb50
00a6aec0	stp x26,x25,[sp, #0x10]
00a6aec4	stp x24,x23,[sp, #0x20]
00a6aec8	stp x22,x21,[sp, #0x30]
00a6aecc	stp x29,x30,[sp, #0x50]
00a6aed0	add x29,sp,#0x50
00a6aed4	mov x22,x5
00a6aed8	mov w24,w4
00a6aedc	mov x23,x3
00a6aee0	mov w25,w2
00a6aee4	mov w21,w1
00a6aee8	str xzr,[sp, #0x8]
00a6aeec	bl 0x00c372e0
00a6aef0	mov x19,x0
00a6aef4	cbz x0,0x00a6af5c
00a6aef8	ldr x0,[x19, #0x8]
00a6aefc	sxtw x8,w25
00a6af00	cmp w25,#0x1
00a6af04	mov w9,#0x800
00a6af08	csel x1,x9,x8,lt
00a6af0c	bl 0x00c375b0
00a6af10	cbz w0,0x00a6af78
00a6af14	cmp w24,#0x0
00a6af18	mov w8,#0x8
00a6af1c	csel w25,w8,w24,eq
00a6af20	tbnz w25,#0x1f,0x00a6afa8
00a6af24	sxtw x26,w25
00a6af28	adrp x1,0x2c5000
00a6af2c	add x1,x1,#0xaf1
00a6af30	mov w2,#0x33
00a6af34	mov x0,x26
00a6af38	bl 0x00c32320
00a6af3c	mov x24,x0
00a6af40	cbz x0,0x00a6aff8
00a6af44	cbz x23,0x00a6b02c
00a6af48	mov x0,x24
00a6af4c	mov x1,x23
00a6af50	mov x2,x26
00a6af54	bl 0x00c2ffd0
00a6af58	b 0x00a6b048
00a6af5c	bl 0x00c342a0
00a6af60	adrp x0,0x2c5000
00a6af64	adrp x2,0x2b5000
00a6af68	add x0,x0,#0xaf1
00a6af6c	add x2,x2,#0xc9e
00a6af70	mov w1,#0x25
00a6af74	b 0x00a6af90
00a6af78	bl 0x00c342a0
00a6af7c	adrp x0,0x2c5000
00a6af80	adrp x2,0x2b5000
00a6af84	add x0,x0,#0xaf1
00a6af88	add x2,x2,#0xc9e
00a6af8c	mov w1,#0x2b
00a6af90	bl 0x00c342b0
00a6af94	mov w1,#0x100
00a6af98	mov w0,#0xd
00a6af9c	movk w1,#0xc, LSL #16
00a6afa0	mov x2,xzr
00a6afa4	bl 0x00c342c0
00a6afa8	mov x24,xzr
00a6afac	adrp x1,0x2c5000
00a6afb0	add x1,x1,#0xaf1
00a6afb4	mov w2,#0x4c
00a6afb8	mov x0,x24
00a6afbc	bl 0x00c32310
00a6afc0	adrp x1,0xc5e000
00a6afc4	add x1,x1,#0xb50
00a6afc8	mov x0,x19
00a6afcc	bl 0x00c36160
00a6afd0	ldr x0,[sp, #0x8]
00a6afd4	bl 0x00c37890
00a6afd8	mov w0,wzr
00a6afdc	ldp x29,x30,[sp, #0x50]
00a6afe0	ldp x20,x19,[sp, #0x40]
00a6afe4	ldp x22,x21,[sp, #0x30]
00a6afe8	ldp x24,x23,[sp, #0x20]
00a6afec	ldp x26,x25,[sp, #0x10]
00a6aff0	add sp,sp,#0x60
00a6aff4	ret
00a6aff8	bl 0x00c342a0
00a6affc	adrp x0,0x2c5000
00a6b000	adrp x2,0x2b5000
00a6b004	add x0,x0,#0xaf1
00a6b008	add x2,x2,#0xc9e
00a6b00c	mov w1,#0x35
00a6b010	bl 0x00c342b0
00a6b014	mov w1,#0x100
00a6b018	mov w0,#0xd
00a6b01c	movk w1,#0xc, LSL #16
00a6b020	mov x2,xzr
00a6b024	bl 0x00c342c0
00a6b028	b 0x00a6afac
00a6b02c	mov x0,x22
00a6b030	mov x1,x24
00a6b034	mov x2,x26
00a6b038	mov w3,wzr
00a6b03c	bl 0x00c347b0
00a6b040	cmp w0,#0x1
00a6b044	b.lt 0x00a6afac
00a6b048	ldr x0,[x19]
00a6b04c	mov x1,x24
00a6b050	mov w2,w25
00a6b054	bl 0x00c37be0
00a6b058	adrp x1,0xc5e000
00a6b05c	add x1,x1,#0xb50
00a6b060	add x2,sp,#0x8
00a6b064	mov x0,x19
00a6b068	bl 0x00c37a90
00a6b06c	cbz x0,0x00a6b0a8
00a6b070	adrp x1,0xc5e000
00a6b074	add x1,x1,#0xb50
00a6b078	mov x0,x19
00a6b07c	bl 0x00c36160
00a6b080	mov w0,w21
00a6b084	bl 0x00c37740
00a6b088	ldr x3,[sp, #0x8]
00a6b08c	mov x1,x0
00a6b090	mov w2,#0x10
00a6b094	mov x0,x20
00a6b098	bl 0x00c37ee0
00a6b09c	cbz w0,0x00a6b0c4
00a6b0a0	mov w0,#0x1
00a6b0a4	b 0x00a6afdc
00a6b0a8	bl 0x00c342a0
00a6b0ac	adrp x0,0x2c5000
00a6b0b0	adrp x2,0x2b5000
00a6b0b4	add x0,x0,#0xaf1
00a6b0b8	add x2,x2,#0xc9e
00a6b0bc	mov w1,#0x41
00a6b0c0	b 0x00a6af90
00a6b0c4	mov x19,xzr
00a6b0c8	b 0x00a6afa8
