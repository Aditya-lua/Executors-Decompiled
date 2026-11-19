; EVP_MD_CTX_clear_flags @ 00a5fb20
00a5fb20	ldr x8,[x0, #0x18]
00a5fb24	mvn w9,w1
00a5fb28	sxtw x9,w9
00a5fb2c	and x8,x8,x9
00a5fb30	str x8,[x0, #0x18]
00a5fb34	ret
