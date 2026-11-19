; FUN_007fce48 @ 007fce48
007fce48	sub sp,sp,#0x50
007fce4c	stp x29,x30,[sp, #0x20]
007fce50	str x21,[sp, #0x30]
007fce54	stp x20,x19,[sp, #0x40]
007fce58	add x29,sp,#0x20
007fce5c	mrs x21,tpidr_el0
007fce60	adrp x20,0xcca000
007fce64	add x20,x20,#0xb88
007fce68	ldr x8,[x21, #0x28]
007fce6c	adrp x19,0xcca000
007fce70	stur x8,[x29, #-0x8]
007fce74	stur wzr,[x29, #-0xc]
007fce78	ldarb w8,[x20]
007fce7c	tbz w8,#0x0,0x007fcf44
007fce80	ldr x8,[x19, #0xb80]
007fce84	mov w9,#0x1f90
007fce88	sub x1,x29,#0xc
007fce8c	movk w9,#0x66b, LSL #16
007fce90	mov w2,#0x4
007fce94	add x0,x8,x9
007fce98	bl 0x00c2ff30
007fce9c	ldarb w8,[x20]
007fcea0	tbz w8,#0x0,0x007fcf7c
007fcea4	ldr x8,[x19, #0xb80]
007fcea8	mov w9,#0xc814
007fceac	nop
007fceb0	adr x1,0x7fd060
007fceb4	movk w9,#0x274, LSL #16
007fceb8	adrp x2,0xcca000
007fcebc	add x2,x2,#0x968
007fcec0	add x0,x8,x9
007fcec4	bl 0x00c2ff40
007fcec8	ldarb w8,[x20]
007fcecc	tbz w8,#0x0,0x007fcfb4
007fced0	ldr x8,[x19, #0xb80]
007fced4	mov w9,#0x856c
007fced8	nop
007fcedc	adr x1,0x7fd0d4
007fcee0	movk w9,#0x225, LSL #16
007fcee4	adrp x2,0xcca000
007fcee8	add x2,x2,#0x970
007fceec	add x0,x8,x9
007fcef0	bl 0x00c2ff40
007fcef4	ldarb w8,[x20]
007fcef8	tbz w8,#0x0,0x007fcfec
007fcefc	ldr x8,[x19, #0xb80]
007fcf00	mov w9,#0x6e44
007fcf04	nop
007fcf08	adr x1,0x7fdaa0
007fcf0c	movk w9,#0x21c, LSL #16
007fcf10	adrp x2,0xcca000
007fcf14	add x2,x2,#0x978
007fcf18	add x0,x8,x9
007fcf1c	bl 0x00c2ff40
007fcf20	ldr x8,[x21, #0x28]
007fcf24	ldur x9,[x29, #-0x8]
007fcf28	cmp x8,x9
007fcf2c	b.ne 0x007fd05c
007fcf30	ldp x20,x19,[sp, #0x40]
007fcf34	ldr x21,[sp, #0x30]
007fcf38	ldp x29,x30,[sp, #0x20]
007fcf3c	add sp,sp,#0x50
007fcf40	ret
007fcf44	adrp x0,0xcca000
007fcf48	add x0,x0,#0xb88
007fcf4c	bl 0x00c2fe90
007fcf50	cbz w0,0x007fce80
007fcf54	adrp x8,0xcca000
007fcf58	str x21,[sp, #0x8]
007fcf5c	ldr x0,[x8, #0x8c8]
007fcf60	bl 0x007fe1ec
007fcf64	str x0,[x19, #0xb80]
007fcf68	adrp x0,0xcca000
007fcf6c	add x0,x0,#0xb88
007fcf70	bl 0x00c2fea0
007fcf74	ldr x21,[sp, #0x8]
007fcf78	b 0x007fce80
007fcf7c	adrp x0,0xcca000
007fcf80	add x0,x0,#0xb88
007fcf84	bl 0x00c2fe90
007fcf88	cbz w0,0x007fcea4
007fcf8c	adrp x8,0xcca000
007fcf90	str x21,[sp, #0x8]
007fcf94	ldr x0,[x8, #0x8c8]
007fcf98	bl 0x007fe1ec
007fcf9c	str x0,[x19, #0xb80]
007fcfa0	adrp x0,0xcca000
007fcfa4	add x0,x0,#0xb88
007fcfa8	bl 0x00c2fea0
007fcfac	ldr x21,[sp, #0x8]
007fcfb0	b 0x007fcea4
007fcfb4	adrp x0,0xcca000
007fcfb8	add x0,x0,#0xb88
007fcfbc	bl 0x00c2fe90
007fcfc0	cbz w0,0x007fced0
007fcfc4	adrp x8,0xcca000
007fcfc8	str x21,[sp, #0x8]
007fcfcc	ldr x0,[x8, #0x8c8]
007fcfd0	bl 0x007fe1ec
007fcfd4	str x0,[x19, #0xb80]
007fcfd8	adrp x0,0xcca000
007fcfdc	add x0,x0,#0xb88
007fcfe0	bl 0x00c2fea0
007fcfe4	ldr x21,[sp, #0x8]
007fcfe8	b 0x007fced0
007fcfec	adrp x0,0xcca000
007fcff0	add x0,x0,#0xb88
007fcff4	bl 0x00c2fe90
007fcff8	cbz w0,0x007fcefc
007fcffc	adrp x8,0xcca000
007fd000	str x21,[sp, #0x8]
007fd004	b 0x00c2fd1c
