; FUN_008bbce8 @ 008bbce8
008bbce8	sub sp,sp,#0x40
008bbcec	stp x29,x30,[sp, #0x10]
008bbcf0	str x21,[sp, #0x20]
008bbcf4	stp x20,x19,[sp, #0x30]
008bbcf8	add x29,sp,#0x10
008bbcfc	mov x21,x1
008bbd00	mov x20,x0
008bbd04	mov x0,x1
008bbd08	mov x1,x2
008bbd0c	mov x19,x2
008bbd10	bl 0x008bb604
008bbd14	strb wzr,[x21, #0x6]
008bbd18	adrp x8,0xd1f000
008bbd1c	add x8,x8,#0x1e0
008bbd20	ldarb w8,[x8]
008bbd24	mov x1,x21
008bbd28	adrp x21,0xd1f000
008bbd2c	tbz w8,#0x0,0x008bbd74
008bbd30	ldr x8,[x21, #0x1d8]
008bbd34	add x8,x8,#0x7f2, LSL #12
008bbd38	add x8,x8,#0xef0
008bbd3c	cmp x0,x8
008bbd40	b.eq 0x008bbd58
008bbd44	ldp x20,x19,[sp, #0x30]
008bbd48	ldr x21,[sp, #0x20]
008bbd4c	ldp x29,x30,[sp, #0x10]
008bbd50	add sp,sp,#0x40
008bbd54	ret
008bbd58	mov x0,x20
008bbd5c	mov x2,x19
008bbd60	ldp x20,x19,[sp, #0x30]
008bbd64	ldr x21,[sp, #0x20]
008bbd68	ldp x29,x30,[sp, #0x10]
008bbd6c	add sp,sp,#0x40
008bbd70	b 0x008bbddc
008bbd74	adrp x8,0xd1f000
008bbd78	add x8,x8,#0x1e0
008bbd7c	str x0,[x29, #0x18]
008bbd80	mov x0,x8
008bbd84	str x1,[sp, #0x8]
008bbd88	bl 0x00c2fe90
008bbd8c	ldr x1,[sp, #0x8]
008bbd90	mov w8,w0
008bbd94	ldr x0,[x29, #0x18]
008bbd98	cbz w8,0x008bbd30
008bbd9c	adrp x8,0xcca000
008bbda0	ldr x0,[x8, #0x8c8]
008bbda4	bl 0x007fe1ec
008bbda8	str x0,[x21, #0x1d8]
008bbdac	adrp x0,0xd1f000
008bbdb0	add x0,x0,#0x1e0
008bbdb4	bl 0x00c2fea0
008bbdb8	ldr x1,[sp, #0x8]
008bbdbc	ldr x0,[x29, #0x18]
008bbdc0	b 0x008bbd30
