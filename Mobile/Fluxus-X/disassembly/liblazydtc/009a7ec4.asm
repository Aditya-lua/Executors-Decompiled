; pqueue_next @ 009a7ec4
009a7ec4	cbz x0,0x009a7edc
009a7ec8	mov x8,x0
009a7ecc	ldr x0,[x0]
009a7ed0	cbz x0,0x009a7edc
009a7ed4	ldr x9,[x0, #0x10]
009a7ed8	str x9,[x8]
009a7edc	ret
