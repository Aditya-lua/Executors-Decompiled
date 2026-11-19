; EVP_PKEY_asn1_get0_info @ 009f09a4
009f09a4	cbz x5,0x009f09ec
009f09a8	cbz x0,0x009f09b4
009f09ac	ldr w8,[x5]
009f09b0	str w8,[x0]
009f09b4	cbz x1,0x009f09c0
009f09b8	ldr w8,[x5, #0x4]
009f09bc	str w8,[x1]
009f09c0	cbz x2,0x009f09cc
009f09c4	ldr x8,[x5, #0x8]
009f09c8	str w8,[x2]
009f09cc	cbz x3,0x009f09d8
009f09d0	ldr x8,[x5, #0x18]
009f09d4	str x8,[x3]
009f09d8	cbz x4,0x009f09e4
009f09dc	ldr x8,[x5, #0x10]
009f09e0	str x8,[x4]
009f09e4	mov w0,#0x1
009f09e8	ret
009f09ec	mov w0,wzr
009f09f0	ret
