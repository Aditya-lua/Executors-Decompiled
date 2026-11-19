; FUN_008aaf04 @ 008aaf04
008aaf04	sub sp,sp,#0x40
008aaf08	stp x29,x30,[sp, #0x10]
008aaf0c	str x21,[sp, #0x20]
008aaf10	stp x20,x19,[sp, #0x30]
008aaf14	add x29,sp,#0x10
008aaf18	mrs x21,tpidr_el0
008aaf1c	mov x19,x0
008aaf20	mov w20,w1
008aaf24	ldr x8,[x21, #0x28]
008aaf28	str x8,[sp, #0x8]
008aaf2c	ldrb w8,[x0, #0x2]
008aaf30	tbz w8,#0x2,0x008aaf44
008aaf34	add x2,x19,#0x38
008aaf38	mov x0,x19
008aaf3c	mov x1,x19
008aaf40	bl 0x008b63a4
008aaf44	ldr x9,[x19, #0x50]
008aaf48	ldr x8,[x19, #0x68]
008aaf4c	ldr x10,[x9, #0x18]
008aaf50	add x11,x8,#0x10
008aaf54	cmp x11,x10
008aaf58	b.ls 0x008aafc0
008aaf5c	ldr x11,[x19, #0x70]
008aaf60	mov w12,#0xf3f0
008aaf64	movk w12,#0x1, LSL #16
008aaf68	sub x11,x8,x11
008aaf6c	cmp x11,x12
008aaf70	b.gt 0x008ab05c
008aaf74	ldr x11,[x19, #0x48]
008aaf78	sub x11,x11,x8
008aaf7c	cmp x11,#0x10
008aaf80	b.gt 0x008aafb0
008aaf84	mov w8,#0x1
008aaf88	nop
008aaf8c	adr x1,0x8aa604
008aaf90	add x2,sp,#0x4
008aaf94	mov x0,x19
008aaf98	str w8,[sp, #0x4]
008aaf9c	bl 0x008b3edc
008aafa0	cbnz w0,0x008ab05c
008aafa4	ldr x9,[x19, #0x50]
008aafa8	ldr x8,[x19, #0x68]
008aafac	ldr x10,[x9, #0x18]
008aafb0	add x11,x8,#0x10
008aafb4	cmp x10,x11
008aafb8	b.cs 0x008aafc0
008aafbc	str x11,[x9, #0x18]
008aafc0	cmp w20,#0x1
008aafc4	b.lt 0x008ab000
008aafc8	ldr x9,[x19, #0x70]
008aafcc	add x9,x9,w20, UXTW  #0x4
008aafd0	sub x0,x9,#0x10
008aafd4	cmp x0,x8
008aafd8	b.cc 0x008ab020
008aafdc	adrp x8,0xd1f000
008aafe0	add x8,x8,#0x1e0
008aafe4	adrp x20,0xd1f000
008aafe8	ldarb w8,[x8]
008aafec	tbz w8,#0x0,0x008ab084
008aaff0	ldr x8,[x20, #0x1d8]
008aaff4	add x8,x8,#0x7f2, LSL #12
008aaff8	add x0,x8,#0xef0
008aaffc	b 0x008ab020
008ab000	mov w9,#0xffffd8f1
008ab004	cmp w20,w9
008ab008	b.lt 0x008ab014
008ab00c	add x0,x8,w20, SXTW  #0x4
008ab010	b 0x008ab020
008ab014	mov x0,x19
008ab018	mov w1,w20
008ab01c	bl 0x008aea7c
008ab020	ldr x8,[x19, #0x68]
008ab024	ldr q0,[x0]
008ab028	str q0,[x8]
008ab02c	ldr x8,[x19, #0x68]
008ab030	add x8,x8,#0x10
008ab034	str x8,[x19, #0x68]
008ab038	ldr x8,[x21, #0x28]
008ab03c	ldr x9,[sp, #0x8]
008ab040	cmp x8,x9
008ab044	b.ne 0x008ab0dc
008ab048	ldp x20,x19,[sp, #0x30]
008ab04c	ldr x21,[sp, #0x20]
008ab050	ldp x29,x30,[sp, #0x10]
008ab054	add sp,sp,#0x40
008ab058	ret
008ab05c	adrp x1,0x2b6000
008ab060	add x1,x1,#0xc71
008ab064	mov x0,x19
008ab068	bl 0x008b9568
008ab06c	ldr x8,[x21, #0x28]
008ab070	ldr x9,[sp, #0x8]
008ab074	cmp x8,x9
008ab078	b.ne 0x008ab0dc
008ab07c	mov x0,x19
008ab080	bl 0x008aa5f4
008ab084	adrp x0,0xd1f000
008ab088	add x0,x0,#0x1e0
008ab08c	bl 0x00c2fe90
008ab090	cbz w0,0x008aaff0
008ab094	adrp x8,0xcca000
008ab098	ldr x0,[x8, #0x8c8]
008ab09c	bl 0x007fe1ec
008ab0a0	str x0,[x20, #0x1d8]
008ab0a4	adrp x0,0xd1f000
008ab0a8	add x0,x0,#0x1e0
008ab0ac	bl 0x00c2fea0
008ab0b0	b 0x008aaff0
008ab0dc	bl 0x00c2fec0
