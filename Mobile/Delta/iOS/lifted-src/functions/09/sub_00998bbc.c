/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998bbc..0x998cf8 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_998bbc_0 {
    long long field_0;
    char padding_8[12];
    unsigned int field_14;
    char padding_18[32];
    long long field_38;
    long long field_40;
    long long field_48;
    char padding_50[1608];
    long long field_698;
    long long field_6a0;
} st_998bbc_0;

typedef struct st_998bbc_1 {
    char padding_0[48];
    unsigned long long field_30;
    char padding_38[32];
    unsigned int field_58;
} st_998bbc_1;


void sub_998bbc(st_998bbc_0 *a0)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long v12;  // x21
    st_998bbc_1 *iter;  // x22
    unsigned long long i;  // x21
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    sub_9d3c28(a0->field_38);
    sub_9d5018(a0->field_40);
    sub_9d3c28(a0->field_48);
    sub_a6c2e4(a0->field_6a0, "ssl/record/methods/tls_common.c", 28);
    a0->field_6a0 = 0;
    v12 = a0->field_698;
    if (v12)
    {
        iter = &(&a0->field_0)[6 * v12 + 6];
        do
        {
            if (!*(int *)&iter->padding_0[40])
                sub_a6c2e4(*(long long *)&iter->padding_0[0], "ssl/record/methods/tls_common.c", 0x88);
            else
                *(unsigned int *)&iter->padding_0[40] = 0;
        } while ((*(unsigned long long *)&iter->padding_0[0] = 0, iter = (char *)iter - 48, v12 -= 1, v12));
    }
    a0->field_698 = 0;
    sub_a4bca0(*(long long *)&a0[2].padding_50[640]);
    sub_a57f0c(*(long long *)&a0[2].padding_50[648]);
    sub_a3f73c(*(long long *)&a0[2].padding_50[664]);
    sub_9f2af8(*(long long *)&a0[2].padding_50[672]);
    sub_a6c2e4(*(long long *)&a0[2].padding_50[800], "ssl/record/methods/tls_common.c", 1470);
    sub_a6c2e4(*(long long *)&a0[2].padding_50[808], "ssl/record/methods/tls_common.c", 1471);
    if (a0->field_14 == 0x300)
        sub_a66ec0(&a0[2].padding_50[720], 64);
    i = 0x700;
    do
    {
        sub_a6c2e4(*(long long *)((char *)a0 + i), "ssl/record/methods/tls_common.c", 37);
        *(unsigned long long *)((char *)a0 + i) = 0;
        i += 72;
    } while (i != 0x1000);
    sub_a6c2e4();
    return;
}
