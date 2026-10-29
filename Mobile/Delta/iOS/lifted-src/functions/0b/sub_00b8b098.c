/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8b098..0xb8b250 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8b098_1 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_b8b098_0 *field_20;
} st_b8b098_1;

typedef struct st_b8b098_0 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    unsigned long long field_18;
    unsigned long long field_20;
} st_b8b098_0;


unsigned long long sub_b8b098(unsigned long long *a0, long long *a1)
{
    unsigned long long v10;  // x0
    st_b8b098_1 **v11;  // x19
    st_b8b098_1 **iter;  // x27
    st_b8b098_1 *v13;  // x22
    st_b8b098_0 *v14;  // x28
    unsigned long v15;  // x23
    unsigned long long j;  // x24
    unsigned long long v17;  // x24
    unsigned long long v0;  // [bp-0xa0]
    char v1;  // [bp-0x98]
    st_b8b098_1 **v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x78]
    unsigned long v6;  // [bp-0x70]
    unsigned long long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v4 = 1;
    v5 = a0[6];
    v6 = a0[4];
    v7 = a0[4] + a0[5] * 64;
    v10 = sub_b76920(&v1, &v4);
    v11 = v2;
    v0 = v1;
    if (v3)
    {
        iter = v11;
        do
        {
            v13 = *iter;
            iter += 1;
            v10 = sub_b7ee20(v13, a1);
            if (v13->field_0 != 10)
                continue;
            v14 = v13->field_20;
            /* unsupported instruction */;
            /* unsupported instruction */;
            if (!/* unsupported instruction */)
            {
                /* unsupported instruction */;
                if (!(/* unsupported instruction */ ^ 1))
                    goto LABEL_b8b154;
            }
            else
            {
                /* unsupported instruction */;
            }
            sub_c7573c(&v14->field_8);
LABEL_b8b154:
            if (v14->field_20)
            {
                v15 = v14->field_18;
                j = v14->field_20 * 8;
                do
                {
                    v17 = j;
                    sub_b86fc8(*a1, 112, v15);
                    v15 += 8;
                    j = v17 - 8;
                } while (j);
            }
            v10 = sub_b872e4(*a1, v14 + 1);
            do
            {
                /* unsupported instruction */;
                if (/* unsupported instruction */ != 1)
                {
                    /* unsupported instruction */;
                    v10 = sub_c75418(&v14->field_8);
                    break;
                }
            } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
        } while (iter != &v11[v3]);
    }
    if (!v0)
        return v10;
    return _free();
}
