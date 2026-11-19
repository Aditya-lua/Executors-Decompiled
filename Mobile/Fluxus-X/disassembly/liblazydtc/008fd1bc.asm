; cpr::Files::operator= @ 008fd1bc
008fd1bc	stp x24,x23,[sp, #-0x40]!
008fd1c0	stp x22,x21,[sp, #0x10]
008fd1c4	stp x20,x19,[sp, #0x20]
008fd1c8	stp x29,x30,[sp, #0x30]
008fd1cc	add x29,sp,#0x30
008fd1d0	mov x20,x1
008fd1d4	mov x19,x0
008fd1d8	cmp x1,x0
008fd1dc	b.eq 0x008fd26c
008fd1e0	ldr x22,[x19]
008fd1e4	cbz x22,0x008fd230
008fd1e8	mov x21,x19
008fd1ec	ldr x23,[x21, #0x8]!
008fd1f0	cmp x23,x22
008fd1f4	b.eq 0x008fd238
008fd1f8	ldurb w8,[x23, #-0x18]
008fd1fc	tbz w8,#0x0,0x008fd208
008fd200	ldur x0,[x23, #-0x8]
008fd204	bl 0x00c301d0
008fd208	ldurb w8,[x23, #-0x30]
008fd20c	sub x24,x23,#0x30
008fd210	tbz w8,#0x0,0x008fd21c
008fd214	ldur x0,[x23, #-0x20]
008fd218	bl 0x00c301d0
008fd21c	cmp x22,x24
008fd220	mov x23,x24
008fd224	b.ne 0x008fd1f8
008fd228	ldr x0,[x19]
008fd22c	b 0x008fd23c
008fd230	add x21,x19,#0x8
008fd234	b 0x008fd24c
008fd238	mov x0,x22
008fd23c	str x22,[x19, #0x8]
008fd240	bl 0x00c301d0
008fd244	stp xzr,xzr,[x19]
008fd248	str xzr,[x19, #0x10]
008fd24c	ldr x8,[x20]
008fd250	str x8,[x19]
008fd254	ldr x8,[x20, #0x8]
008fd258	str x8,[x21]
008fd25c	ldr x8,[x20, #0x10]
008fd260	str x8,[x19, #0x10]
008fd264	stp xzr,xzr,[x20]
008fd268	str xzr,[x20, #0x10]
008fd26c	mov x0,x19
008fd270	ldp x29,x30,[sp, #0x30]
008fd274	ldp x20,x19,[sp, #0x20]
008fd278	ldp x22,x21,[sp, #0x10]
008fd27c	ldp x24,x23,[sp], #0x40
008fd280	ret
