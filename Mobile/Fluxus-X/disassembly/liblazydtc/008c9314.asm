; FUN_008c9314 @ 008c9314
008c9314	stp x29,x30,[sp, #-0x20]!
008c9318	stp x20,x19,[sp, #0x10]
008c931c	mov x29,sp
008c9320	mov x19,x1
008c9324	mov x20,x0
008c9328	bl 0x008b4cdc
008c932c	ldr x8,[x19, #0x8]
008c9330	mov x2,x0
008c9334	ldur q0,[x8, #0x68]
008c9338	ldr w8,[x8, #0x98]
008c933c	stur q0,[x0, #0x68]
008c9340	ldr x1,[x19]
008c9344	str w8,[x0, #0x98]
008c9348	mov x0,x20
008c934c	ldp x3,x4,[x1, #0x28]
008c9350	str x2,[x19, #0x10]
008c9354	ldp x20,x19,[sp, #0x10]
008c9358	ldp x29,x30,[sp], #0x20
008c935c	b 0x008cab38
