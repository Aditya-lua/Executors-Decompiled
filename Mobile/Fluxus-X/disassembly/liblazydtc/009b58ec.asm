; ssl_cipher_id_cmp @ 009b58ec
009b58ec	ldr w8,[x0, #0x18]
009b58f0	ldr w9,[x1, #0x18]
009b58f4	cmp w8,w9
009b58f8	csetm w8,cc
009b58fc	csinc w0,w8,wzr,ls
009b5900	ret
