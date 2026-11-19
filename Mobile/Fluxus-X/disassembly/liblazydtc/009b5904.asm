; ssl_cipher_ptr_id_cmp @ 009b5904
009b5904	ldr x8,[x0]
009b5908	ldr x9,[x1]
009b590c	ldr w8,[x8, #0x18]
009b5910	ldr w9,[x9, #0x18]
009b5914	cmp w8,w9
009b5918	csetm w8,cc
009b591c	csinc w0,w8,wzr,ls
009b5920	ret
