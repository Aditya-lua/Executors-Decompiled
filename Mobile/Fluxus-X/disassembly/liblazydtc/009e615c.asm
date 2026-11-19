; tls13_restore_handshake_digest_for_pha @ 009e615c
009e615c	str x19,[sp, #-0x20]!
009e6160	stp x29,x30,[sp, #0x10]
009e6164	ldr x1,[x0, #0xbc8]
009e6168	mov x19,x0
009e616c	add x29,sp,#0x10
009e6170	cbz x1,0x009e6188
009e6174	ldr x0,[x19, #0x190]
009e6178	bl 0x00c34bf0
009e617c	cbz w0,0x009e61a4
009e6180	mov w0,#0x1
009e6184	b 0x009e61dc
009e6188	bl 0x00c342a0
009e618c	adrp x0,0x2bb000
009e6190	adrp x2,0x2bf000
009e6194	add x0,x0,#0x912
009e6198	add x2,x2,#0xa06
009e619c	mov w1,#0x963
009e61a0	b 0x009e61bc
009e61a4	bl 0x00c342a0
009e61a8	adrp x0,0x2bb000
009e61ac	adrp x2,0x2bf000
009e61b0	add x0,x0,#0x912
009e61b4	add x2,x2,#0xa06
009e61b8	mov w1,#0x968
009e61bc	bl 0x00c342b0
009e61c0	mov w2,#0x103
009e61c4	mov w1,#0x50
009e61c8	movk w2,#0xc, LSL #16
009e61cc	mov x0,x19
009e61d0	mov x3,xzr
009e61d4	bl 0x00c34410
009e61d8	mov w0,wzr
009e61dc	ldp x29,x30,[sp, #0x10]
009e61e0	ldr x19,[sp], #0x20
009e61e4	ret
