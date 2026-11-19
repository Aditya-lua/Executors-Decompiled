; FUN_008e4d8c @ 008e4d8c
008e4d8c	mov x8,x0
008e4d90	mov w0,wzr
008e4d94	mov x9,x8
008e4d98	ldr x9,[x9]
008e4d9c	cmp x9,x8
008e4da0	b.eq 0x008e4dac
008e4da4	add w0,w0,#0x1
008e4da8	b 0x008e4d98
008e4dac	ret
