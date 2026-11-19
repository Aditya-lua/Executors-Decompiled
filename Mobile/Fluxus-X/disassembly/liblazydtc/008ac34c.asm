; FUN_008ac34c @ 008ac34c
008ac34c	sub sp,sp,#0x50
008ac350	stp x29,x30,[sp, #0x10]
008ac354	str x23,[sp, #0x20]
008ac358	stp x22,x21,[sp, #0x30]
008ac35c	stp x20,x19,[sp, #0x40]
008ac360	add x29,sp,#0x10
008ac364	mrs x22,tpidr_el0
008ac368	mov x20,x2
008ac36c	mov x19,x0
008ac370	ldr x8,[x22, #0x28]
008ac374	mov x21,x1
008ac378	str x8,[sp, #0x8]
008ac37c	ldr x8,[x0, #0x60]
008ac380	ldp x8,x9,[x8, #0x8]
008ac384	cmp x9,x8
008ac388	b.cc 0x008ac398
008ac38c	mov x0,x19
008ac390	mov w1,#0x1
008ac394	bl 0x008b52c4
008ac398	ldrb w8,[x19, #0x2]
008ac39c	tbz w8,#0x2,0x008ac3b0
008ac3a0	add x2,x19,#0x38
008ac3a4	mov x0,x19
008ac3a8	mov x1,x19
008ac3ac	bl 0x008b63a4
008ac3b0	ldr x8,[x19, #0x50]
008ac3b4	ldr x23,[x19, #0x68]
008ac3b8	ldr x9,[x8, #0x18]
008ac3bc	add x10,x23,#0x10
008ac3c0	cmp x10,x9
008ac3c4	b.ls 0x008ac42c
008ac3c8	ldr x10,[x19, #0x70]
008ac3cc	mov w11,#0xf3f0
008ac3d0	movk w11,#0x1, LSL #16
008ac3d4	sub x10,x23,x10
008ac3d8	cmp x10,x11
008ac3dc	b.gt 0x008ac47c
008ac3e0	ldr x10,[x19, #0x48]
008ac3e4	sub x10,x10,x23
008ac3e8	cmp x10,#0x10
008ac3ec	b.gt 0x008ac41c
008ac3f0	mov w8,#0x1
008ac3f4	nop
008ac3f8	adr x1,0x8aa604
008ac3fc	add x2,sp,#0x4
008ac400	mov x0,x19
008ac404	str w8,[sp, #0x4]
008ac408	bl 0x008b3edc
008ac40c	cbnz w0,0x008ac47c
008ac410	ldr x8,[x19, #0x50]
008ac414	ldr x23,[x19, #0x68]
008ac418	ldr x9,[x8, #0x18]
008ac41c	add x10,x23,#0x10
008ac420	cmp x9,x10
008ac424	b.cs 0x008ac42c
008ac428	str x10,[x8, #0x18]
008ac42c	mov x0,x19
008ac430	mov x1,x21
008ac434	mov x2,x20
008ac438	bl 0x008b9ff8
008ac43c	str x0,[x23]
008ac440	mov w8,#0x5
008ac444	ldr x9,[x19, #0x68]
008ac448	str w8,[x23, #0xc]
008ac44c	add x8,x9,#0x10
008ac450	str x8,[x19, #0x68]
008ac454	ldr x8,[x22, #0x28]
008ac458	ldr x9,[sp, #0x8]
008ac45c	cmp x8,x9
008ac460	b.ne 0x008ac4a4
008ac464	ldp x20,x19,[sp, #0x40]
008ac468	ldr x23,[sp, #0x20]
008ac46c	ldp x22,x21,[sp, #0x30]
008ac470	ldp x29,x30,[sp, #0x10]
008ac474	add sp,sp,#0x50
008ac478	ret
008ac47c	adrp x1,0x2b6000
008ac480	add x1,x1,#0xc71
008ac484	mov x0,x19
008ac488	bl 0x008b9568
008ac48c	ldr x8,[x22, #0x28]
008ac490	ldr x9,[sp, #0x8]
008ac494	cmp x8,x9
008ac498	b.ne 0x008ac4a4
008ac49c	mov x0,x19
008ac4a0	bl 0x008aa5f4
008ac4a4	bl 0x00c2fec0
