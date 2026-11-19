; ossl_gost18_cke_cipher_nid @ 009e0c08
009e0c08	ldr x8,[x0, #0x2e0]
009e0c0c	ldr w8,[x8, #0x24]
009e0c10	tbnz w8,#0x16,0x009e0c24
009e0c14	lsl w8,w8,#0x8
009e0c18	mov w9,#0x3f5
009e0c1c	and w0,w9,w8, ASR #0x1f
009e0c20	ret
009e0c24	mov w0,#0x4a4
009e0c28	ret
