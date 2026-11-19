; FUN_008e50a4 @ 008e50a4
008e50a4	cbz w1,0x008e50d8
008e50a8	str x30,[sp, #-0x20]!
008e50ac	stp x20,x19,[sp, #0x10]
008e50b0	mov x20,x0
008e50b4	mov w0,w1
008e50b8	mov w19,w1
008e50bc	bl 0x008e4ff0
008e50c0	stp x0,x0,[x20, #0x8]
008e50c4	str w19,[x20, #0x18]
008e50c8	ldp x20,x19,[sp, #0x10]
008e50cc	mov w0,#0x1
008e50d0	ldr x30,[sp], #0x20
008e50d4	ret
008e50d8	mov w0,wzr
008e50dc	ret
