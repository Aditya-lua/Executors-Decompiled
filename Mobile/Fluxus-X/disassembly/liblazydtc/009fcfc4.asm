; BIO_get_retry_BIO @ 009fcfc4
009fcfc4	mov x8,x0
009fcfc8	mov x9,x0
009fcfcc	mov x0,x9
009fcfd0	mov x9,x8
009fcfd4	ldrb w8,[x8, #0x30]
009fcfd8	tbz w8,#0x3,0x009fcfe8
009fcfdc	ldr x8,[x9, #0x48]
009fcfe0	mov x0,x9
009fcfe4	cbnz x8,0x009fcfcc
009fcfe8	cbz x1,0x009fcff4
009fcfec	ldr w8,[x0, #0x34]
009fcff0	str w8,[x1]
009fcff4	ret
