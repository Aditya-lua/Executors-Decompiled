; pqueue_size @ 009a7ee0
009a7ee0	ldr x8,[x0]
009a7ee4	cbz x8,0x009a7efc
009a7ee8	mov x0,xzr
009a7eec	ldr x8,[x8, #0x10]
009a7ef0	add x0,x0,#0x1
009a7ef4	cbnz x8,0x009a7eec
009a7ef8	ret
009a7efc	mov x0,xzr
009a7f00	ret
