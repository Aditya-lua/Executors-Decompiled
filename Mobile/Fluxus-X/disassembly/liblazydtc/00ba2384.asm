; psa_format_key_data_for_storage @ 00ba2384
00ba2384	mov x9,#0x5350
00ba2388	movk x9,#0x41, LSL #16
00ba238c	movk x9,#0x454b, LSL #32
00ba2390	movk x9,#0x59, LSL #48
00ba2394	str wzr,[x3, #0x8]
00ba2398	str x9,[x3]
00ba239c	ldr w9,[x2, #0x4]
00ba23a0	mov x8,x1
00ba23a4	mov x1,x0
00ba23a8	add x0,x3,#0x24
00ba23ac	str w9,[x3, #0xc]
00ba23b0	ldrh w9,[x2]
00ba23b4	strh w9,[x3, #0x10]
00ba23b8	ldrh w9,[x2, #0x2]
00ba23bc	strh w9,[x3, #0x12]
00ba23c0	ldr w9,[x2, #0x8]
00ba23c4	str w9,[x3, #0x14]
00ba23c8	ldr w9,[x2, #0xc]
00ba23cc	str w9,[x3, #0x18]
00ba23d0	ldr w9,[x2, #0x10]
00ba23d4	mov x2,x8
00ba23d8	stp w9,w8,[x3, #0x1c]
00ba23dc	b 0x00c2ffd0
