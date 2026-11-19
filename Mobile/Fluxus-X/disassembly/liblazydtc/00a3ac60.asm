; ossl_ec_GFp_simple_cmp @ 00a3ac60
00a3ac60	sub sp,sp,#0x70
00a3ac64	stp x28,x27,[sp, #0x10]
00a3ac68	stp x26,x25,[sp, #0x20]
00a3ac6c	stp x24,x23,[sp, #0x30]
00a3ac70	stp x22,x21,[sp, #0x40]
00a3ac74	stp x20,x19,[sp, #0x50]
00a3ac78	stp x29,x30,[sp, #0x60]
00a3ac7c	add x29,sp,#0x60
00a3ac80	mov x19,x3
00a3ac84	mov x21,x2
00a3ac88	mov x23,x1
00a3ac8c	mov x22,x0
00a3ac90	bl 0x00c3ae10
00a3ac94	mov w20,w0
00a3ac98	mov x0,x22
00a3ac9c	mov x1,x21
00a3aca0	bl 0x00c3ae10
00a3aca4	cbz w20,0x00a3acb4
00a3aca8	cmp w0,#0x0
00a3acac	cset w21,eq
00a3acb0	b 0x00a3aed4
00a3acb4	cbz w0,0x00a3acc0
00a3acb8	mov w21,#0x1
00a3acbc	b 0x00a3aed4
00a3acc0	ldr w8,[x23, #0x28]
00a3acc4	cbz w8,0x00a3acf8
00a3acc8	ldr w8,[x21, #0x28]
00a3accc	cbz w8,0x00a3acf8
00a3acd0	ldr x0,[x23, #0x10]
00a3acd4	ldr x1,[x21, #0x10]
00a3acd8	bl 0x00c38cc0
00a3acdc	cbnz w0,0x00a3acb8
00a3ace0	ldr x0,[x23, #0x18]
00a3ace4	ldr x1,[x21, #0x18]
00a3ace8	bl 0x00c38cc0
00a3acec	cmp w0,#0x0
00a3acf0	cset w21,ne
00a3acf4	b 0x00a3aed4
00a3acf8	ldr x8,[x22]
00a3acfc	mov x20,xzr
00a3ad00	ldp x26,x24,[x8, #0xf8]
00a3ad04	cbnz x19,0x00a3ad1c
00a3ad08	ldr x0,[x22, #0xa8]
00a3ad0c	bl 0x00c38a60
00a3ad10	mov x20,x0
00a3ad14	mov x19,x0
00a3ad18	cbz x0,0x00a3ae08
00a3ad1c	mov x0,x19
00a3ad20	bl 0x00c38a90
00a3ad24	mov x0,x19
00a3ad28	bl 0x00c38a40
00a3ad2c	mov x27,x0
00a3ad30	mov x0,x19
00a3ad34	bl 0x00c38a40
00a3ad38	str x0,[sp, #0x8]
00a3ad3c	mov x0,x19
00a3ad40	bl 0x00c38a40
00a3ad44	mov x25,x0
00a3ad48	mov x0,x19
00a3ad4c	bl 0x00c38a40
00a3ad50	cbz x0,0x00a3aec0
00a3ad54	ldr w8,[x21, #0x28]
00a3ad58	mov x28,x0
00a3ad5c	cbz w8,0x00a3ad8c
00a3ad60	str x26,[sp]
00a3ad64	ldr x26,[x23, #0x10]
00a3ad68	ldr w8,[x23, #0x28]
00a3ad6c	cbz w8,0x00a3adcc
00a3ad70	ldr x24,[x21, #0x10]
00a3ad74	mov x0,x26
00a3ad78	mov x1,x24
00a3ad7c	bl 0x00c38cc0
00a3ad80	cbz w0,0x00a3ae10
00a3ad84	mov w21,#0x1
00a3ad88	b 0x00a3aec4
00a3ad8c	ldr x2,[x21, #0x20]
00a3ad90	mov x0,x22
00a3ad94	mov x1,x28
00a3ad98	mov x3,x19
00a3ad9c	blr x24
00a3ada0	cbz w0,0x00a3aec0
00a3ada4	ldr x2,[x23, #0x10]
00a3ada8	mov x0,x22
00a3adac	mov x1,x27
00a3adb0	mov x3,x28
00a3adb4	mov x4,x19
00a3adb8	str x26,[sp]
00a3adbc	blr x26
00a3adc0	mov x26,x27
00a3adc4	cbnz w0,0x00a3ad68
00a3adc8	b 0x00a3aec0
00a3adcc	ldr x2,[x23, #0x20]
00a3add0	mov x0,x22
00a3add4	mov x1,x25
00a3add8	mov x3,x19
00a3addc	blr x24
00a3ade0	cbz w0,0x00a3aec0
00a3ade4	ldp x8,x24,[sp]
00a3ade8	ldr x2,[x21, #0x10]
00a3adec	mov x0,x22
00a3adf0	mov x3,x25
00a3adf4	mov x1,x24
00a3adf8	mov x4,x19
00a3adfc	blr x8
00a3ae00	cbnz w0,0x00a3ad74
00a3ae04	b 0x00a3aec0
00a3ae08	mov w21,#0xffffffff
00a3ae0c	b 0x00a3aed4
00a3ae10	ldr w8,[x21, #0x28]
00a3ae14	cbz w8,0x00a3ae40
00a3ae18	ldr x26,[x23, #0x18]
00a3ae1c	ldr w8,[x23, #0x28]
00a3ae20	cbz w8,0x00a3ae84
00a3ae24	ldr x24,[x21, #0x18]
00a3ae28	mov x0,x26
00a3ae2c	mov x1,x24
00a3ae30	bl 0x00c38cc0
00a3ae34	cmp w0,#0x0
00a3ae38	cset w21,ne
00a3ae3c	b 0x00a3aec4
00a3ae40	ldr x3,[x21, #0x20]
00a3ae44	ldr x8,[sp]
00a3ae48	mov x0,x22
00a3ae4c	mov x1,x28
00a3ae50	mov x2,x28
00a3ae54	mov x4,x19
00a3ae58	blr x8
00a3ae5c	cbz w0,0x00a3aec0
00a3ae60	ldr x2,[x23, #0x18]
00a3ae64	ldr x8,[sp]
00a3ae68	mov x0,x22
00a3ae6c	mov x1,x27
00a3ae70	mov x3,x28
00a3ae74	mov x4,x19
00a3ae78	blr x8
00a3ae7c	cbnz w0,0x00a3ae1c
00a3ae80	b 0x00a3aec0
00a3ae84	ldr x3,[x23, #0x20]
00a3ae88	ldr x23,[sp]
00a3ae8c	mov x0,x22
00a3ae90	mov x1,x25
00a3ae94	mov x2,x25
00a3ae98	mov x4,x19
00a3ae9c	blr x23
00a3aea0	cbz w0,0x00a3aec0
00a3aea4	ldr x2,[x21, #0x18]
00a3aea8	ldr x1,[sp, #0x8]
00a3aeac	mov x0,x22
00a3aeb0	mov x3,x25
00a3aeb4	mov x4,x19
00a3aeb8	blr x23
00a3aebc	cbnz w0,0x00a3ae28
00a3aec0	mov w21,#0xffffffff
00a3aec4	mov x0,x19
00a3aec8	bl 0x00c38a20
00a3aecc	mov x0,x20
00a3aed0	bl 0x00c38a30
00a3aed4	mov w0,w21
00a3aed8	ldp x29,x30,[sp, #0x60]
00a3aedc	ldp x20,x19,[sp, #0x50]
00a3aee0	ldp x22,x21,[sp, #0x40]
00a3aee4	ldp x24,x23,[sp, #0x30]
00a3aee8	ldp x26,x25,[sp, #0x20]
00a3aeec	ldp x28,x27,[sp, #0x10]
00a3aef0	add sp,sp,#0x70
00a3aef4	ret
