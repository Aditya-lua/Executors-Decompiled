/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc02b98..0xc02d10 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c02b98_0 {
    unsigned long long field_0;
    char padding_8[24];
    unsigned long long field_20;
} st_c02b98_0;


unsigned long long sub_c02b98(unsigned long long *a0, long long *a1)
{
    st_c02b98_0 **v9;  // x19
    st_c02b98_0 **iter;  // x25
    unsigned long long *v11;  // x21
    unsigned long v12;  // x8
    unsigned long v13;  // x8
    unsigned long long v0;  // [bp-0x88]
    st_c02b98_0 **v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = 1;
    v4 = a0[6];
    v5 = a0[4];
    v6 = a0[4] + a0[5] * 64;
    sub_b76920(&v0, &v3);
    v9 = v1;
    if (v2)
    {
        iter = v9;
        do
        {
            v11 = &*iter->field_0;
            iter += 1;
            if (sub_c01b88(v11, a1) & 1)
            {
                if (v0)
                {
                    _free(v9);
                    return 1;
                }
                return 1;
            }
            if (*v11 != 10)
                continue;
            v12 = v11[4];
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
                /* unsupported instruction */;
                v13 = v12;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_c02c4c;
            }
            else
            {
                /* unsupported instruction */;
            }
            v13 = v12;
            sub_c7573c(v12 + 8);
LABEL_c02c4c:
            sub_c093f0(v13 + 40, *a1);
            do
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                {
                    /* unsupported instruction */;
                    sub_c75418(v12 + 8);
                    break;
                }
            } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
        } while (iter != &v9[v2]);
    }
    if (!v0)
        return 0;
    _free(v9);
    return 0;
}
