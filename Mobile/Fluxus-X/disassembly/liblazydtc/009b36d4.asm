; ssl_free_wbio_buffer @ 009b36d4
009b36d4	ldr x8,[x0, #0x20]
009b36d8	cbz x8,0x009b3710
009b36dc	str x19,[sp, #-0x20]!
009b36e0	stp x29,x30,[sp, #0x10]
009b36e4	mov x19,x0
009b36e8	ldr x0,[x0, #0x18]
009b36ec	add x29,sp,#0x10
009b36f0	bl 0x00c35630
009b36f4	ldr x8,[x19, #0x20]
009b36f8	str x0,[x19, #0x18]
009b36fc	mov x0,x8
009b3700	bl 0x00c31a40
009b3704	str xzr,[x19, #0x20]
009b3708	ldp x29,x30,[sp, #0x10]
009b370c	ldr x19,[sp], #0x20
009b3710	mov w0,#0x1
009b3714	ret
