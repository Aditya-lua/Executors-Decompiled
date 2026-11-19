; tls_process_cert_status @ 009de990
009de990	stp x29,x30,[sp, #-0x10]!
009de994	mov x29,sp
009de998	bl 0x009e09c0
009de99c	cmp w0,#0x0
009de9a0	orr w8,wzr,#0x3
009de9a4	csel w0,wzr,w8,eq
009de9a8	ldp x29,x30,[sp], #0x10
009de9ac	ret
