; pqueue_find @ 009a7e78
009a7e78	ldr x9,[x0]
009a7e7c	cbz x9,0x009a7eb4
009a7e80	mov x8,x9
009a7e84	ldr x9,[x9, #0x10]
009a7e88	cbz x9,0x009a7ea0
009a7e8c	ldr x10,[x1]
009a7e90	ldr x11,[x8]
009a7e94	cmp x11,x10
009a7e98	b.ne 0x009a7e80
009a7e9c	mov x9,x8
009a7ea0	ldr x10,[x1]
009a7ea4	ldr x11,[x8]
009a7ea8	cmp x11,x10
009a7eac	csel x0,x8,x9,eq
009a7eb0	ret
009a7eb4	mov x0,xzr
009a7eb8	ret
