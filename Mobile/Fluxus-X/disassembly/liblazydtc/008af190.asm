; FUN_008af190 @ 008af190
008af190	sub sp,sp,#0x40
008af194	str d8,[sp, #0x10]
008af198	stp x29,x30,[sp, #0x18]
008af19c	str x21,[sp, #0x28]
008af1a0	stp x20,x19,[sp, #0x30]
008af1a4	add x29,sp,#0x18
008af1a8	mrs x21,tpidr_el0
008af1ac	fmov d8,d0
008af1b0	mov w19,w1
008af1b4	ldr x8,[x21, #0x28]
008af1b8	mov x20,x0
008af1bc	str x8,[sp, #0x8]
008af1c0	bl 0x008ab0e0
008af1c4	cmp w0,#0x1
008af1c8	b.lt 0x008af1e8
008af1cc	add x2,sp,#0x4
008af1d0	mov x0,x20
008af1d4	mov w1,w19
008af1d8	bl 0x008ab528
008af1dc	ldr w8,[sp, #0x4]
008af1e0	cbz w8,0x008af214
008af1e4	fmov d8,d0
008af1e8	ldr x8,[x21, #0x28]
008af1ec	ldr x9,[sp, #0x8]
008af1f0	cmp x8,x9
008af1f4	b.ne 0x008af234
008af1f8	fmov d0,d8
008af1fc	ldp x20,x19,[sp, #0x30]
008af200	ldr x21,[sp, #0x28]
008af204	ldp x29,x30,[sp, #0x18]
008af208	ldr d8,[sp, #0x10]
008af20c	add sp,sp,#0x40
008af210	ret
008af214	ldr x8,[x21, #0x28]
008af218	ldr x9,[sp, #0x8]
008af21c	cmp x8,x9
008af220	b.ne 0x008af234
008af224	mov x0,x20
008af228	mov w1,w19
008af22c	mov w2,#0x3
008af230	bl 0x008af05c
008af234	bl 0x00c2fec0
