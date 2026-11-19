; pqueue_pop @ 009a7e60
009a7e60	mov x8,x0
009a7e64	ldr x0,[x0]
009a7e68	cbz x0,0x009a7e74
009a7e6c	ldr x9,[x0, #0x10]
009a7e70	str x9,[x8]
009a7e74	ret
