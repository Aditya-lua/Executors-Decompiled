; ssl_x509err2alert @ 009e4d14
009e4d14	adrp x8,0x74d000
009e4d18	add x8,x8,#0x6d0
009e4d1c	ldr w9,[x8], #0x8
009e4d20	cbz w9,0x009e4d2c
009e4d24	cmp w9,w0
009e4d28	b.ne 0x009e4d1c
009e4d2c	ldur w0,[x8, #-0x4]
009e4d30	ret
