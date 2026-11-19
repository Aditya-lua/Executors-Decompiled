; FUN_008b3e4c @ 008b3e4c
008b3e4c	ldr x8,[x0, #0x90]
008b3e50	cbz x8,0x008b3e70
008b3e54	ldr w9,[x0, #0xa8]
008b3e58	ldr x10,[x0, #0x8]
008b3e5c	ldrb w8,[x8, w1, SXTW ]
008b3e60	asr w9,w1,w9
008b3e64	ldr w9,[x10, w9, SXTW #0x2]
008b3e68	add w0,w9,w8
008b3e6c	ret
008b3e70	mov w0,wzr
008b3e74	ret
