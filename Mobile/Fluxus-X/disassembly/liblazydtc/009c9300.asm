; DTLS_RECORD_LAYER_set_saved_w_epoch @ 009c9300
009c9300	ldr x8,[x0, #0x10b8]
009c9304	and w9,w1,#0xffff
009c9308	ldrh w10,[x8, #0x2]
009c930c	sub w11,w10,#0x1
009c9310	cmp w11,w9
009c9314	b.ne 0x009c9334
009c9318	ldr x9,[x0, #0x10a8]
009c931c	str x9,[x8, #0x60]
009c9320	ldr x8,[x0, #0x10b8]
009c9324	mov w9,#0x10a8
009c9328	add x9,x0,x9
009c932c	add x10,x8,#0x58
009c9330	b 0x009c9358
009c9334	add w10,w10,#0x1
009c9338	cmp w10,w9
009c933c	b.ne 0x009c9360
009c9340	ldr x9,[x0, #0x10a8]
009c9344	str x9,[x8, #0x58]
009c9348	ldr x8,[x0, #0x10b8]
009c934c	mov w9,#0x10a8
009c9350	add x9,x0,x9
009c9354	add x10,x8,#0x60
009c9358	ldr x10,[x10]
009c935c	str x10,[x9]
009c9360	strh w1,[x8, #0x2]
009c9364	ret
