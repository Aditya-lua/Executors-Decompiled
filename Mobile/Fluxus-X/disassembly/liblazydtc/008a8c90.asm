; FUN_008a8c90 @ 008a8c90
008a8c90	sub sp,sp,#0x90
008a8c94	stp x29,x30,[sp, #0x60]
008a8c98	str x21,[sp, #0x70]
008a8c9c	stp x20,x19,[sp, #0x80]
008a8ca0	add x29,sp,#0x60
008a8ca4	mrs x20,tpidr_el0
008a8ca8	adrp x19,0xc4c000
008a8cac	add x19,x19,#0x6f0
008a8cb0	ldr x8,[x20, #0x28]
008a8cb4	stur x8,[x29, #-0x8]
008a8cb8	adrp x8,0x29a000
008a8cbc	ldr d0,[x8, #0x678]
008a8cc0	mov x8,sp
008a8cc4	stp x19,x0,[sp]
008a8cc8	add x21,x8,#0x38
008a8ccc	ldr x8,[x4]
008a8cd0	stp x1,x2,[sp, #0x10]
008a8cd4	str d0,[sp, #0x30]
008a8cd8	stp x3,x21,[sp, #0x20]
008a8cdc	ldr x8,[x8]
008a8ce0	mov x1,sp
008a8ce4	mov x0,x4
008a8ce8	blr x8
008a8cec	ldr w8,[sp, #0x30]
008a8cf0	str x19,[sp]
008a8cf4	cbz w8,0x008a8cfc
008a8cf8	str wzr,[sp, #0x30]
008a8cfc	ldr x0,[sp, #0x28]
008a8d00	cmp x0,x21
008a8d04	b.eq 0x008a8d0c
008a8d08	bl 0x00c301d0
008a8d0c	ldr x8,[x20, #0x28]
008a8d10	ldur x9,[x29, #-0x8]
008a8d14	cmp x8,x9
008a8d18	b.ne 0x008a8d70
008a8d1c	ldp x20,x19,[sp, #0x80]
008a8d20	ldr x21,[sp, #0x70]
008a8d24	ldp x29,x30,[sp, #0x60]
008a8d28	add sp,sp,#0x90
008a8d2c	ret
008a8d70	bl 0x00c2fec0
