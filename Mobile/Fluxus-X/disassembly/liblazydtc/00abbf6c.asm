; PKCS12_verify_mac @ 00abbf6c
00abbf6c	sub sp,sp,#0x70
00abbf70	stp x29,x30,[sp, #0x60]
00abbf74	ldr x8,[x0, #0x8]
00abbf78	str x19,[sp, #0x50]
00abbf7c	add x29,sp,#0x60
00abbf80	cbz x8,0x00abbfe8
00abbf84	add x3,sp,#0x10
00abbf88	sub x4,x29,#0x4
00abbf8c	mov x19,x0
00abbf90	bl 0x00abbc20
00abbf94	cbz w0,0x00abc010
00abbf98	ldr x8,[x19, #0x8]
00abbf9c	add x2,sp,#0x8
00abbfa0	mov x1,xzr
00abbfa4	ldr x0,[x8]
00abbfa8	bl 0x00c38300
00abbfac	ldr x0,[sp, #0x8]
00abbfb0	ldur w19,[x29, #-0x4]
00abbfb4	bl 0x00c32140
00abbfb8	cmp w19,w0
00abbfbc	mov w0,wzr
00abbfc0	b.ne 0x00abc040
00abbfc4	ldr x0,[sp, #0x8]
00abbfc8	bl 0x00c32130
00abbfcc	ldur w2,[x29, #-0x4]
00abbfd0	mov x1,x0
00abbfd4	add x0,sp,#0x10
00abbfd8	bl 0x00c362f0
00abbfdc	cmp w0,#0x0
00abbfe0	cset w0,eq
00abbfe4	b 0x00abc040
00abbfe8	bl 0x00c342a0
00abbfec	adrp x0,0x2ca000
00abbff0	adrp x2,0x2b8000
00abbff4	add x0,x0,#0x250
00abbff8	add x2,x2,#0x50a
00abbffc	orr w1,wzr,#0xc0
00abc000	bl 0x00c342b0
00abc004	mov w0,#0x23
00abc008	mov w1,#0x6c
00abc00c	b 0x00abc034
00abc010	bl 0x00c342a0
00abc014	adrp x0,0x2ca000
00abc018	adrp x2,0x2b8000
00abc01c	add x0,x0,#0x250
00abc020	add x2,x2,#0x50a
00abc024	mov w1,#0xc4
00abc028	bl 0x00c342b0
00abc02c	mov w0,#0x23
00abc030	mov w1,#0x6d
00abc034	mov x2,xzr
00abc038	bl 0x00c342c0
00abc03c	mov w0,wzr
00abc040	ldp x29,x30,[sp, #0x60]
00abc044	ldr x19,[sp, #0x50]
00abc048	add sp,sp,#0x70
00abc04c	ret
