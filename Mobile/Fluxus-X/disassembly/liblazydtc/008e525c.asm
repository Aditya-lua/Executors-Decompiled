; FUN_008e525c @ 008e525c
008e525c	str x30,[sp, #-0x30]!
008e5260	stp x22,x21,[sp, #0x10]
008e5264	stp x20,x19,[sp, #0x20]
008e5268	ldr w19,[x0, #0x1c]
008e526c	cmp w19,w1
008e5270	b.cs 0x008e52d4
008e5274	add w8,w1,#0x40
008e5278	and w19,w8,#0xffffffc0
008e527c	lsl w22,w19,#0x3
008e5280	mov x20,x0
008e5284	mov w0,w22
008e5288	bl 0x008e4ff0
008e528c	cbz x0,0x008e52d0
008e5290	mov w1,#0x41
008e5294	mov w2,w22
008e5298	mov x21,x0
008e529c	bl 0x008e4fd4
008e52a0	ldr w8,[x20, #0x18]
008e52a4	ldr x1,[x20, #0x10]
008e52a8	mov x0,x21
008e52ac	lsl w2,w8,#0x3
008e52b0	bl 0x008e4fb8
008e52b4	ldr w8,[x20, #0x1c]
008e52b8	ldr x0,[x20, #0x10]
008e52bc	lsl w1,w8,#0x3
008e52c0	bl 0x008e4ff8
008e52c4	str x21,[x20, #0x10]
008e52c8	str w19,[x20, #0x1c]
008e52cc	b 0x008e52d4
008e52d0	mov w19,wzr
008e52d4	mov w0,w19
008e52d8	ldp x20,x19,[sp, #0x20]
008e52dc	ldp x22,x21,[sp, #0x10]
008e52e0	ldr x30,[sp], #0x30
008e52e4	ret
