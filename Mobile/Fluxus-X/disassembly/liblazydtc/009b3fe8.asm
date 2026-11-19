; SSL_pending @ 009b3fe8
009b3fe8	stp x29,x30,[sp, #-0x10]!
009b3fec	ldr x8,[x0, #0x8]
009b3ff0	mov x29,sp
009b3ff4	ldr x8,[x8, #0xa0]
009b3ff8	blr x8
009b3ffc	orr w8,wzr,#0x7fffffff
009b4000	cmp x0,x8
009b4004	csel w0,w0,w8,cc
009b4008	ldp x29,x30,[sp], #0x10
009b400c	ret
