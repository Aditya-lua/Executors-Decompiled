; SSL_bytes_to_cipher_list @ 009b8fe8
009b8fe8	tbnz x2,#0x3f,0x009b9024
009b8fec	sub sp,sp,#0x20
009b8ff0	mov w8,w3
009b8ff4	stp x1,x2,[sp]
009b8ff8	mov x1,sp
009b8ffc	mov x2,x4
009b9000	mov x3,x5
009b9004	mov w4,w8
009b9008	mov w5,wzr
009b900c	stp x29,x30,[sp, #0x10]
009b9010	add x29,sp,#0x10
009b9014	bl 0x009b902c
009b9018	ldp x29,x30,[sp, #0x10]
009b901c	add sp,sp,#0x20
009b9020	ret
009b9024	mov w0,wzr
009b9028	ret
