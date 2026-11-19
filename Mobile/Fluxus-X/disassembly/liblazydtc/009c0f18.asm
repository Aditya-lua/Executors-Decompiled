; tls1_get_supported_groups @ 009c0f18
009c0f18	ldr x8,[x0, #0x898]
009c0f1c	ldr w8,[x8, #0x1c]
009c0f20	and w8,w8,#0x30000
009c0f24	cmp w8,#0x10, LSL #12
009c0f28	b.eq 0x009c0f54
009c0f2c	cmp w8,#0x20, LSL #12
009c0f30	b.eq 0x009c0f60
009c0f34	cmp w8,#0x30, LSL #12
009c0f38	b.ne 0x009c0f7c
009c0f3c	adrp x8,0x74c000
009c0f40	add x8,x8,#0xd84
009c0f44	str x8,[x1]
009c0f48	mov w8,#0x2
009c0f4c	str x8,[x2]
009c0f50	ret
009c0f54	adrp x8,0x74c000
009c0f58	add x8,x8,#0xd84
009c0f5c	b 0x009c0f6c
009c0f60	adrp x8,0x74c000
009c0f64	add x8,x8,#0xd84
009c0f68	add x8,x8,#0x2
009c0f6c	str x8,[x1]
009c0f70	mov w8,#0x1
009c0f74	str x8,[x2]
009c0f78	ret
009c0f7c	ldr x8,[x0, #0xac8]
009c0f80	cbz x8,0x009c0f94
009c0f84	str x8,[x1]
009c0f88	ldr x8,[x0, #0xac0]
009c0f8c	str x8,[x2]
009c0f90	ret
009c0f94	ldr x8,[x0, #0x9a8]
009c0f98	ldr x8,[x8, #0x288]
009c0f9c	str x8,[x1]
009c0fa0	ldr x8,[x0, #0x9a8]
009c0fa4	ldr x8,[x8, #0x290]
009c0fa8	str x8,[x2]
009c0fac	ret
