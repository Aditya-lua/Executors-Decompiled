; cpr::Session::makeDownloadRequest @ 008ebe40
008ebe40	stp x20,x19,[sp, #-0x20]!
008ebe44	stp x29,x30,[sp, #0x10]
008ebe48	add x29,sp,#0x10
008ebe4c	ldr x9,[x0, #0x2a0]
008ebe50	mov x19,x0
008ebe54	mov x20,x8
008ebe58	cbz x9,0x008ebe70
008ebe5c	ldp x29,x30,[sp, #0x10]
008ebe60	mov x8,x20
008ebe64	mov x0,x19
008ebe68	ldp x20,x19,[sp], #0x20
008ebe6c	b 0x00c313b0
008ebe70	mov x0,x19
008ebe74	bl 0x00c31250
008ebe78	ldp x29,x30,[sp, #0x10]
008ebe7c	mov w1,w0
008ebe80	mov x8,x20
008ebe84	mov x0,x19
008ebe88	ldp x20,x19,[sp], #0x20
008ebe8c	b 0x00c312a0
