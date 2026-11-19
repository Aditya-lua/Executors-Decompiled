; ASYNC_WAIT_CTX_get_all_fds @ 009f9aa8
009f9aa8	ldr x8,[x0]
009f9aac	str xzr,[x2]
009f9ab0	cbz x8,0x009f9ae8
009f9ab4	mov x9,xzr
009f9ab8	ldr w10,[x8, #0x24]
009f9abc	cbz w10,0x009f9acc
009f9ac0	ldr x8,[x8, #0x28]
009f9ac4	cbnz x8,0x009f9ab8
009f9ac8	b 0x009f9ae8
009f9acc	cbz x1,0x009f9ad8
009f9ad0	ldr w10,[x8, #0x8]
009f9ad4	str w10,[x1], #0x4
009f9ad8	add x9,x9,#0x1
009f9adc	str x9,[x2]
009f9ae0	ldr x8,[x8, #0x28]
009f9ae4	cbnz x8,0x009f9ab8
009f9ae8	mov w0,#0x1
009f9aec	ret
