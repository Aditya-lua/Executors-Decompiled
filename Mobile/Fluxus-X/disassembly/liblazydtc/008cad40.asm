; FUN_008cad40 @ 008cad40
008cad40	sub sp,sp,#0x70
008cad44	stp x29,x30,[sp, #0x40]
008cad48	stp x22,x21,[sp, #0x50]
008cad4c	stp x20,x19,[sp, #0x60]
008cad50	add x29,sp,#0x40
008cad54	mrs x20,tpidr_el0
008cad58	ldr x8,[x20, #0x28]
008cad5c	stur x8,[x29, #-0x8]
008cad60	ldr w8,[x1, #0xc]
008cad64	cmp w8,#0x3
008cad68	b.ne 0x008cada8
008cad6c	ldr d0,[x1]
008cad70	mov x19,x0
008cad74	add x0,sp,#0x8
008cad78	add x21,sp,#0x8
008cad7c	mov x22,x1
008cad80	bl 0x008b8cac
008cad84	sub x2,x0,x21
008cad88	add x1,sp,#0x8
008cad8c	mov x0,x19
008cad90	bl 0x008b9ff8
008cad94	mov w8,#0x5
008cad98	str x0,[x22]
008cad9c	mov w0,#0x1
008cada0	str w8,[x22, #0xc]
008cada4	b 0x008cadac
008cada8	mov w0,wzr
008cadac	ldr x8,[x20, #0x28]
008cadb0	ldur x9,[x29, #-0x8]
008cadb4	cmp x8,x9
008cadb8	b.ne 0x008cadd0
008cadbc	ldp x20,x19,[sp, #0x60]
008cadc0	ldp x22,x21,[sp, #0x50]
008cadc4	ldp x29,x30,[sp, #0x40]
008cadc8	add sp,sp,#0x70
008cadcc	ret
008cadd0	bl 0x00c2fec0
