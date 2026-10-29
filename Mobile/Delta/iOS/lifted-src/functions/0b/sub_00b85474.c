/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb85474..0xb855f8 (388 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b85474_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_b85474_0;


unsigned long long sub_b85474(unsigned long long *a0, long long *a1)
{
    unsigned long long v9;  // x0
    st_b85474_0 **iter;  // x26
    st_b85474_0 *v11;  // x22
    unsigned long v12;  // x8
    unsigned long v13;  // x8
    char v0;  // [bp-0xb8], Other Possible Types: unsigned long
    st_b85474_0 **v1;  // [bp-0xb0]
    unsigned long v2;  // [bp-0xa8]
    unsigned long v3;  // [bp-0xa0]
    unsigned long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = 2;
    v4 = 2;
    v5 = a0[1];
    v6 = a0[1] + a0[2] * 128;
    v9 = sub_b73064(&v0, &v3);
    if (v2)
    {
        iter = v1;
        do
        {
            v11 = *iter;
            iter += 1;
            v9 = sub_b7f144(v11, a1);
            if (v11->field_0 != 10)
                continue;
            sub_b942a8(*a1, v11->field_10, v11->field_10 + v11->field_18 * 16);
            v12 = v11->field_20;
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
                /* unsupported instruction */;
                v13 = v12;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_b85538;
            }
            else
            {
                /* unsupported instruction */;
            }
            v13 = v12;
            sub_c7573c(v12 + 8);
LABEL_b85538:
            v9 = sub_b88bd4(*a1, v13 + 40);
            do
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                {
                    /* unsupported instruction */;
                    v9 = sub_c75418(v12 + 8);
                    break;
                }
            } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
        } while (iter != &v1[v2]);
    }
    if (!v0)
        return v9;
    return _free();
}
