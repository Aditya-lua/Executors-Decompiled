/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x971534..0x971720 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_971534_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[16];
    unsigned long long field_30;
    unsigned long long field_38;
    unsigned long long field_40;
    unsigned long long field_48;
    char padding_50[32];
    void* field_70;
    void* field_78;
    void* field_80;
    void* field_88;
    void* field_90;
    void* field_98;
} st_971534_0;


void* sub_971534(st_971534_0 *a0, long long a1)
{
    void* v2;  // x0
    void* v3;  // x21
    unsigned int v12;  // w9
    void* v4;  // x0
    void* v5;  // x22
    void* v6;  // x0
    void* v7;  // x23
    void* v8;  // x0
    void* v9;  // x24
    void* v10;  // x0
    void* v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6fbc4(a1, "max_dgram_payload_len");
    if (!v2)
    {
        v3 = 0;
        goto LABEL_971588;
    }
    if ((int)v2[8] != 2 || (long long)v2[24] != 8)
        return 0;
    v3 = (long long)v2[16];
LABEL_971588:
    v4 = sub_a6fbc4(a1, "cur_cwnd_size");
    if (!v4)
    {
        v5 = 0;
        goto LABEL_9715c0;
    }
    if ((int)v4[8] == 2 && (long long)v4[24] == 8)
    {
        v5 = (long long)v4[16];
LABEL_9715c0:
        v6 = sub_a6fbc4(a1, "min_cwnd_size");
        if (!v6)
        {
            v7 = 0;
            goto LABEL_9715f8;
        }
        else if ((int)v6[8] == 2 && (long long)v6[24] == 8)
        {
            v7 = (long long)v6[16];
LABEL_9715f8:
            v8 = sub_a6fbc4(a1, "bytes_in_flight");
            if (!v8)
            {
                v9 = 0;
LABEL_971630:
                v10 = sub_a6fbc4(a1, "cur_state");
                if (v10)
                {
                    if ((int)v10[8] == 2 && (long long)v10[24] == 4)
                    {
                        v11 = (long long)v10[16];
                        goto LABEL_971680;
                    }
                }
                else
                {
                    v11 = 0;
LABEL_971680:
                    if (v3)
                        a0->field_78 = v3;
                    if (v5)
                        a0->field_80 = v5;
                    if (v7)
                        a0->field_88 = v7;
                    if (v9)
                        a0->field_90 = v9;
                    if (v11)
                        a0->field_98 = v11;
                    if (a0->field_78)
                        *(unsigned long long *)a0->field_78 = a0->field_30;
                    if (a0->field_80)
                        *(unsigned long long *)a0->field_80 = a0->field_40;
                    if (a0->field_88)
                        *(unsigned long long *)a0->field_88 = a0->field_18;
                    if (a0->field_90)
                        *(unsigned long long *)a0->field_90 = a0->field_38;
                    if (!a0->field_98)
                        return 1;
                    if ((int)a0->field_70)
                    {
                        v12 = 82;
                    }
                    else
                    {
                        if (a0->field_40 < a0->field_48)
                            v12 = 83;
                        else
                            v12 = 65;
                    }
LABEL_971714:
                    *(unsigned int *)a0->field_98 = v12;
                    goto LABEL_971714;
                    return 1;
                }
            }
            else if ((int)v8[8] == 2 && (long long)v8[24] == 8)
            {
                v9 = (long long)v8[16];
                goto LABEL_971630;
            }
        }
    }
    return 0;
}
