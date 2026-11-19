; FUN_00907b8c @ 00907b8c
00907b8c	ldr x9,[x0, #0x20]
00907b90	mov x8,x0
00907b94	add x10,x9,w1, SXTW  #0x3
00907b98	ldr x0,[x10, #0x248]
00907b9c	cbz x0,0x00907bb0
00907ba0	ldr x9,[x0]
00907ba4	mov x1,x8
00907ba8	ldr x5,[x9, #0x30]
00907bac	br x5
00907bb0	ldr x9,[x9, #0x50]
00907bb4	str x9,[x2]
00907bb8	ldr x9,[x8, #0x20]
00907bbc	ldr x9,[x9, #0x58]
00907bc0	str x9,[x3]
00907bc4	ldr x8,[x8, #0x20]
00907bc8	ldr w8,[x8, #0x560]
00907bcc	str w8,[x4]
00907bd0	ret
