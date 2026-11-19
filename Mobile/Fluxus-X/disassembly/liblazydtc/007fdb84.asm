; FUN_007fdb84 @ 007fdb84
007fdb84	sub sp,sp,#0x40
007fdb88	stp x29,x30,[sp, #0x10]
007fdb8c	stp x22,x21,[sp, #0x20]
007fdb90	stp x20,x19,[sp, #0x30]
007fdb94	add x29,sp,#0x10
007fdb98	mrs x19,tpidr_el0
007fdb9c	adrp x20,0xcca000
007fdba0	ldr x8,[x19, #0x28]
007fdba4	str x8,[sp, #0x8]
007fdba8	ldr x0,[x20, #0x8c8]
007fdbac	bl 0x007fe1ec
007fdbb0	cbnz x0,0x007fdbd4
007fdbb4	mov w21,#0x9680
007fdbb8	movk w21,#0x98, LSL #16
007fdbbc	mov x0,sp
007fdbc0	str x21,[sp]
007fdbc4	bl 0x00c2ff90
007fdbc8	ldr x0,[x20, #0x8c8]
007fdbcc	bl 0x007fe1ec
007fdbd0	cbz x0,0x007fdbbc
007fdbd4	adrp x20,0xcb4000
007fdbd8	adrp x21,0xcb4000
007fdbdc	ldr x20,[x20, #0x960]
007fdbe0	ldr x8,[x20]
007fdbe4	ldr x21,[x21, #0x968]
007fdbe8	cbz x8,0x007fdbf4
007fdbec	ldr x8,[x21]
007fdbf0	cbnz x8,0x007fdc18
007fdbf4	mov w22,#0x9680
007fdbf8	movk w22,#0x98, LSL #16
007fdbfc	mov x0,sp
007fdc00	str x22,[sp]
007fdc04	bl 0x00c2ff90
007fdc08	ldr x8,[x20]
007fdc0c	cbz x8,0x007fdbfc
007fdc10	ldr x8,[x21]
007fdc14	cbz x8,0x007fdbfc
007fdc18	bl 0x008068b4
007fdc1c	bl 0x007fce48
007fdc20	ldr x8,[x19, #0x28]
007fdc24	ldr x9,[sp, #0x8]
007fdc28	cmp x8,x9
007fdc2c	b.ne 0x007fdc44
007fdc30	ldp x20,x19,[sp, #0x30]
007fdc34	ldp x22,x21,[sp, #0x20]
007fdc38	ldp x29,x30,[sp, #0x10]
007fdc3c	add sp,sp,#0x40
007fdc40	ret
007fdc44	bl 0x00c2fec0
