; mbedtls_asn1_write_null @ 00b85510
00b85510	ldr x8,[x0]
00b85514	sub x9,x8,x1
00b85518	cmp x9,#0x1
00b8551c	b.lt 0x00b85554
00b85520	sub x9,x8,#0x1
00b85524	str x9,[x0]
00b85528	sturb wzr,[x8, #-0x1]
00b8552c	ldr x8,[x0]
00b85530	sub x9,x8,x1
00b85534	cmp x9,#0x1
00b85538	b.lt 0x00b8555c
00b8553c	sub x9,x8,#0x1
00b85540	mov w10,#0x5
00b85544	str x9,[x0]
00b85548	mov w0,#0x2
00b8554c	sturb w10,[x8, #-0x1]
00b85550	ret
00b85554	mov w0,#0xffffff94
00b85558	ret
00b8555c	mov w0,#0xffffff94
00b85560	ret
