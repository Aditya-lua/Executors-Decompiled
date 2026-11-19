; cpr::ThreadPool::ThreadPool @ 008fdc38
008fdc38	stp x29,x30,[sp, #-0x10]!
008fdc3c	mov x29,sp
008fdc40	adrp x8,0xcb4000
008fdc44	ldr x8,[x8, #0xd68]
008fdc48	add x9,x0,#0x38
008fdc4c	stp x2,x3,[x0, #0x10]
008fdc50	str wzr,[x0, #0x20]
008fdc54	add x8,x8,#0x10
008fdc58	stp xzr,xzr,[x0, #0x28]
008fdc5c	stp x9,x9,[x0, #0x38]
008fdc60	stp x8,x1,[x0], #0x48
008fdc64	mov w2,#0xb8
008fdc68	mov w1,wzr
008fdc6c	bl 0x00c301c0
008fdc70	ldp x29,x30,[sp], #0x10
008fdc74	ret
