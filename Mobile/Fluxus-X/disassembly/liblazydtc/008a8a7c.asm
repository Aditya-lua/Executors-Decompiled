; FUN_008a8a7c @ 008a8a7c
008a8a7c	sub sp,sp,#0x50
008a8a80	stp x29,x30,[sp, #0x10]
008a8a84	str x23,[sp, #0x20]
008a8a88	stp x22,x21,[sp, #0x30]
008a8a8c	stp x20,x19,[sp, #0x40]
008a8a90	add x29,sp,#0x10
008a8a94	mrs x22,tpidr_el0
008a8a98	mov x19,x1
008a8a9c	mov x20,x0
008a8aa0	ldr x8,[x22, #0x28]
008a8aa4	adrp x1,0x2a5000
008a8aa8	add x1,x1,#0x18d
008a8aac	mov x0,x19
008a8ab0	mov x21,x2
008a8ab4	str x8,[sp, #0x8]
008a8ab8	bl 0x00853270
008a8abc	str x0,[sp]
008a8ac0	cbz x0,0x008a8ad8
008a8ac4	mov x1,sp
008a8ac8	mov x0,x20
008a8acc	bl 0x008a8b48
008a8ad0	mov w8,#0x1
008a8ad4	str w8,[x0]
008a8ad8	cbz x21,0x008a8b1c
008a8adc	ldr x1,[x21]
008a8ae0	cbz x1,0x008a8b1c
008a8ae4	add x21,x21,#0x8
008a8ae8	mov w23,#0x1
008a8aec	b 0x008a8af8
008a8af0	ldr x1,[x21], #0x8
008a8af4	cbz x1,0x008a8b1c
008a8af8	mov x0,x19
008a8afc	bl 0x00853270
008a8b00	str x0,[sp]
008a8b04	cbz x0,0x008a8af0
008a8b08	mov x1,sp
008a8b0c	mov x0,x20
008a8b10	bl 0x008a8b48
008a8b14	str w23,[x0]
008a8b18	b 0x008a8af0
008a8b1c	ldr x8,[x22, #0x28]
008a8b20	ldr x9,[sp, #0x8]
008a8b24	cmp x8,x9
008a8b28	b.ne 0x008a8b44
008a8b2c	ldp x20,x19,[sp, #0x40]
008a8b30	ldr x23,[sp, #0x20]
008a8b34	ldp x22,x21,[sp, #0x30]
008a8b38	ldp x29,x30,[sp, #0x10]
008a8b3c	add sp,sp,#0x50
008a8b40	ret
008a8b44	bl 0x00c2fec0
