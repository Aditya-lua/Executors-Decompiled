; EVP_PKEY_gettable_params @ 00a6f90c
00a6f90c	cbz x0,0x00a6f91c
00a6f910	ldr x0,[x0, #0x60]
00a6f914	cbz x0,0x00a6f91c
00a6f918	b 0x00c3d3d0
00a6f91c	mov x0,xzr
00a6f920	ret
