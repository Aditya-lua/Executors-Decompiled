/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x961650..0x961b28 (1240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_961650_0 {
    char padding_0[208];
    struct st_961650_1 *field_d0;
} st_961650_0;

typedef struct st_961650_1 {
    unsigned long long field_0;
} st_961650_1;


unsigned long long sub_961650(unsigned long a0, unsigned long long a1, st_961650_0 *a2)
{
    unsigned long long idx;  // x19
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    long long v5;  // x21
    long long v6;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", 3994, "SSL_CTX_new_ex");
        sub_a36abc(20, 196, 0);
    }
    else if (sub_95de6c(0x200000, 0))
    {
        if (!(sub_958124() >> 31 & 1))
        {
            idx = sub_a6bffc(1768, "ssl/ssl_lib.c", 4007);
            if (!idx)
                return idx;
            /* unsupported instruction */;
            *(unsigned int *)(idx + 164) = 1;
            v3 = sub_a7c11c();
            *(unsigned long long *)(idx + 1008) = v3;
            if (v3)
            {
                *(unsigned long *)idx = a0;
                if (!a1 || !(v4 = sub_a6d9b4(a1, "ssl/ssl_lib.c", 4033), *(unsigned long long *)(idx + 1136) = v4, !v4))
                {
                    *(st_961650_0 **)(idx + 8) = a2;
                    *(unsigned int *)(idx + 328) = 0;
                    *(double *)(idx + 320) = 2e-323;
                    *(unsigned int *)(idx + 80) = 2;
                    *(unsigned long long *)(idx + 56) = 0x5000;
                    a2->field_d0();
                }
            }
            else
            {
                v5 = 4019;
                v6 = 524303;
LABEL_961a90:
                sub_a368c8();
                sub_a369bc("ssl/ssl_lib.c", v5, "SSL_CTX_new_ex");
                sub_a36abc(20, v6, 0);
            }
            sub_95e3b8(idx);
        }
        else
        {
            idx = 0;
            v6 = 269;
            v5 = 4003;
            goto LABEL_961a90;
        }
    }
    return 0;
}
