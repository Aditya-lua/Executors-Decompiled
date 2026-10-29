/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa18f5c..0xa190d0 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a18f5c_0 {
    char padding_0[24];
    long long field_18;
    long long field_20;
    unsigned int field_28;
    char padding_2c[16];
    unsigned int field_3c;
    char padding_40[16];
    long long field_50;
    char padding_58[8];
    unsigned long long field_60;
} st_a18f5c_0;


unsigned int sub_a18f5c(st_a18f5c_0 *a0)
{
    long long v2;  // x22
    unsigned int v3;  // x19
    unsigned int v4;  // x20
    unsigned int v5;  // x0
    unsigned int v6;  // x23
    long long v7;  // x24
    unsigned int v8;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_18;
    v3 = sub_9dde48(a0->field_50);
    if (v3)
    {
        v4 = *(long long *)&a0->field_28;
        if (*(long long *)&a0->field_28 || (v4 = sub_9e4988(), v4))
        {
            v5 = sub_c4ba8(v2);
            if (!v5)
                goto LABEL_a18fd0;
            if (!(a0->field_3c >> 2 & 1))
            {
                v6 = sub_9e4b00();
                if (v6)
                    goto LABEL_a19054;
                goto LABEL_a18fd4;
            }
            v6 = sub_9e4958();
            if (!v6 || !sub_9db58c(v6, v5, sub_9e4624()))
                goto LABEL_a18fd4;
            do
            {
LABEL_a19054:
                if (!sub_9e93c8(v4, v6, 0, v3))
                    goto LABEL_a18fd4;
            } while (sub_9e4828(v4));
            v7 = a0->field_20;
            if (!a0->field_20 && !(v7 = sub_a1a56c(v2), v7))
                goto LABEL_a18fd8;
            if (!sub_a1b804(v2, v7, v4, 0, 0, v3))
                goto LABEL_a18fd8;
            a0->field_20 = v7;
            *(unsigned long long *)&a0->field_28 = v4;
            a0->field_60 = a0->field_60 + 1;
            v8 = 1;
            v4 = 0;
            v7 = 0;
        }
        else
        {
LABEL_a18fd0:
            v6 = 0;
LABEL_a18fd4:
            v7 = 0;
LABEL_a18fd8:
            sub_9e4cf0(*(long long *)&a0->field_28);
            if (a0->field_20)
                sub_a1b11c(v2);
            v8 = 0;
        }
    }
    else
    {
        v6 = 0;
        v7 = 0;
        v4 = 0;
        goto LABEL_a18fd8;
    }
    sub_a1a254(v7);
    sub_9e4838(v4);
    sub_9dded4(v3);
    sub_9e48d4(v6);
    return v8;
}
